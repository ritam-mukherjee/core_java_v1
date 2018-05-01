package concepts.threads.thread_creation.dfifferent_approaches;

/**
 * Created by PouRit on 09-11-2017.
 */
class CustomExtendThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\'" + Thread.currentThread().getName() +
                    "\' is executing, Count:" + i);

        }
    }


}

class CustomImplementRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\'" + Thread.currentThread().getName() +
                    "\' is executing, Count:" + i);

        }
    }
}

    public class ThredCreationNormslApproach {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("------------APPROACH 1: By extending Thread Class-------------");
        Thread t1 = new CustomExtendThread();
        t1.setName("Extended Thread");
        t1.start();

        t1.join();

        System.out.println("------------APPROACH 2: By Implementing Runnable Interface--------");
        new Thread(new CustomImplementRunnable(), "Implemented Thread").start();

    }
}
