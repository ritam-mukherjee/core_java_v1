package concepts.threads.thread_creation;

/**
 * Created by PouRit on 09-11-2017.
 */
public class ThreadCreationLambdaApproach {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("--------APPROACH 1: by Instancing Runnable Object-------");
        Runnable runnable =() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("\'" + Thread.currentThread().getName() +
                        "\' is executing, Count:" + i);

            }
        };

        new Thread(runnable, "Runnable Thread").start();

        Thread.sleep(5000);

        System.out.println("--------APPROACH 2: Without Instancing Runnable Object-------");
        new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("\'" + Thread.currentThread().getName() +
                        "\' is executing, Count:" + i);

            }
        }, "Runnable Inner Thread").start();
    }
}
