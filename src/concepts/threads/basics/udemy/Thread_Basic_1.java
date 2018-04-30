package concepts.threads.basics.udemy;


import static concepts.threads.basics.udemy.ThreadColor.ANSI_GREEN;
import static concepts.threads.basics.udemy.ThreadColor.ANSI_PURPLE;

public class Thread_Basic_1 {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();
       // anotherThread.start();
        /*After starting a thread if we are trying to restart the same thread then we will get RuntimeException,
         saying IllegalThreadStateException.*/


        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        System.out.println(ANSI_PURPLE+"Hello again from the main thread.");


    }
}
