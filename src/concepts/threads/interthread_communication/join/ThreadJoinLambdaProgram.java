package concepts.threads.interthread_communication.join;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 * Created by PouRit on 09-11-2017.
 */
public class ThreadJoinLambdaProgram {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable=() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("\'" + Thread.currentThread().getName() +
                        "\' is executing, Count:" + i);

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        BiFunction<Runnable,String,Thread> threadRunner=(runnable1, s) -> {
            Thread thread=new Thread(runnable,s);
            return thread;
        };

        /*First Thread Start executing*/
        Thread firstThread=threadRunner.apply(runnable,"First Thread");
        Thread secondThread=threadRunner.apply(runnable,"Second Thread");
        firstThread.start();

        firstThread.join();

        secondThread.start();
    }
}
