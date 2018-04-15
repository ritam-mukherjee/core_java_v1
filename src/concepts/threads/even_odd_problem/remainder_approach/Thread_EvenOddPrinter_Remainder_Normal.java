package concepts.threads.even_odd_problem.remainder_approach;

/**
 * Source   :   https://java2blog.com/print-even-odd-numbers-threads-java/
 */
class OddEvenRunnable implements Runnable{

    public int PRINT_NUMBERS_UPTO=10;
    static int  number=1;
    int remainder;
    static Object lock=new Object();

    OddEvenRunnable(int remainder)
    {
        this.remainder=remainder;
    }

    @Override
    public void run() {
        while (number < PRINT_NUMBERS_UPTO) {
            synchronized (lock) {
                while (number % 2 != remainder) { // wait for numbers other than remainder
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();
            }
        }
    }
}
public class Thread_EvenOddPrinter_Remainder_Normal {
    public static void main(String[] args) {
        OddEvenRunnable oddRunnable=new OddEvenRunnable(1);
        OddEvenRunnable evenRunnable=new OddEvenRunnable(0);

        Thread t1=new Thread(oddRunnable,"Odd");
        Thread t2=new Thread(evenRunnable,"Even");

        t1.start();
        t2.start();
    }
}
