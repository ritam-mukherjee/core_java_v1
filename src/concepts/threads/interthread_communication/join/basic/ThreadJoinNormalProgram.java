package concepts.threads.interthread_communication.join.basic;

/**
 * Created by PouRit on 09-11-2017.
 */
public class ThreadJoinNormalProgram {
    public static void main(String[] args) throws InterruptedException,Exception{
        Thread joinThread=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("\'" + Thread.currentThread().getName() +
                            "\' is executing, Count:" + i);

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }, "joinThread");

        joinThread.start();

            joinThread.join();

        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+" " +
                    "is executing");

                Thread.sleep(2000);

        }
    }
}
