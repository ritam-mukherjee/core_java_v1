package concepts.threads.even_odd_problem.boolean_variablle_approach;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_EvenOddNumber_Printer_Lambda {
    boolean odd;
    int count = 1;
    int MAX = 20;

    public Object lock=new Object();
    Thread odd_thread=new Thread(() -> {
        synchronized (lock){
            while (count < MAX) {
                System.out.println(ThreadColor.ANSI_PURPLE+"Checking odd loop");

                while (!odd) {
                    try {
                        System.out.println(ThreadColor.ANSI_PURPLE+"Odd waiting : " + count);
                        lock.wait();
                        System.out.println("Notified odd :" + count);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                System.out.println(ThreadColor.ANSI_PURPLE+"Odd Thread :" + count);
                count++;
                odd = false;
                lock.notify();
            }
        }
    },"Odd Thread");

    Thread even_thread=new Thread(() -> {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        synchronized (lock) {
            while (count < MAX) {
                System.out.println(ThreadColor.ANSI_CYAN+"Checking even loop");

                while (odd) {
                    try {
                        System.out.println(ThreadColor.ANSI_CYAN+"Even waiting: " + count);
                        lock.wait();
                        System.out.println(ThreadColor.ANSI_CYAN+"Notified even:" + count);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(ThreadColor.ANSI_CYAN+"Even thread :" + count);
                count++;
                odd = true;
                lock.notify();

            }
        }
    },"ODD Thread");



    public static void main(String[] args) {



        ExecutorService service= Executors.newFixedThreadPool(2);
        Thread_EvenOddNumber_Printer_Lambda even_odd=new Thread_EvenOddNumber_Printer_Lambda();
        service.submit(even_odd.even_thread);
        service.submit(even_odd.odd_thread);

        service.shutdown();

    }
}
