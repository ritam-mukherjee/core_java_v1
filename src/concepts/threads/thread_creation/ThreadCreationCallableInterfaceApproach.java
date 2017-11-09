package concepts.threads.thread_creation;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BiConsumer;

/**
 * Created by PouRit on 09-11-2017.
 */
public class ThreadCreationCallableInterfaceApproach {
    public static void main(String[] args) {
        Callable callable=() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("\'" + Thread.currentThread().getName() +
                        "\' is executing, Count:" + i);

            }
            return Thread.currentThread().getName();
        };




        BiConsumer<Callable,ExecutorService> serviceBiConsumer=(callable1, service1) -> {
         service1.submit(callable1);
        };


        ExecutorService service= Executors.newFixedThreadPool(3);
        serviceBiConsumer.accept(callable,service);
    }


}
