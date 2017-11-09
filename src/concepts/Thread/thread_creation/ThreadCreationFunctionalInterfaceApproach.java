package concepts.Thread.thread_creation;

import java.util.function.BiConsumer;

/**
 * Created by PouRit on 09-11-2017.
 */
public class ThreadCreationFunctionalInterfaceApproach {

    public static void main(String[] args) {
        BiConsumer<Runnable,String> runnable_Consumer=(runnable, s) -> {
            new Thread(runnable,s).start();
        };
        runnable_Consumer.accept(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("\'" + Thread.currentThread().getName() +
                        "\' is executing, Count:" + i);

            }
        },"Bi-consumer Thread");


    }

}
