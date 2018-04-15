package concepts.threads.even_odd_problem.boolean_variablle_approach;

/**
 *
 * Source   :   https://java2blog.com/print-even-odd-numbers-threads-java/
 */
public class Thread_EvenOddNumber_Printer_Normal {
    boolean odd;
    int count = 1;
    int MAX = 20;

    public void printOdd() {
        synchronized (this) {
            while (count < MAX) {
                System.out.println(ThreadColor.ANSI_PURPLE+"Checking odd loop");

                while (!odd) {
                    try {
                        System.out.println(ThreadColor.ANSI_PURPLE+"Odd waiting : " + count);
                        wait();
                        System.out.println("Notified odd :" + count);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                System.out.println(ThreadColor.ANSI_PURPLE+"Odd Thread :" + count);
                count++;
                odd = false;
                notify();
            }
        }
    }

    public void printEven() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        synchronized (this) {
            while (count < MAX) {
                System.out.println(ThreadColor.ANSI_CYAN+"Checking even loop");

                while (odd) {
                    try {
                        System.out.println(ThreadColor.ANSI_CYAN+"Even waiting: " + count);
                        wait();
                        System.out.println(ThreadColor.ANSI_CYAN+"Notified even:" + count);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(ThreadColor.ANSI_CYAN+"Even thread :" + count);
                count++;
                odd = true;
                notify();

            }
        }
    }

    public static void main(String[] args) {

        Thread_EvenOddNumber_Printer_Normal oep = new Thread_EvenOddNumber_Printer_Normal();
        oep.odd = true;
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                oep.printEven();

            }
        });
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                oep.printOdd();

            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
