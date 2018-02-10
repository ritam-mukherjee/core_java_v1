package concepts.threads.cyclic_barrier.plural_sight_example;

/**
 * Source   :   PluralSight
 * Here Bariier will noy Break but main thread wait for sdometime and then don't bother for barrier
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class TimeOutBarrierInAction {
    public static void main(String[] args) {

        class Friend implements Callable{

            private CyclicBarrier cyclicBarrier;

            public Friend(CyclicBarrier cyclicBarrier) {
                this.cyclicBarrier = cyclicBarrier;
            }

            @Override
            public String call() throws Exception {

                Random random=new Random();
                Thread.sleep(random.nextInt(20)*100+100);
                System.out.println("I just arrived,waiting for others...");
                cyclicBarrier.await();

                
                System.out.println("let's go for a cinema");
                return "ok";
            }
        }


        ExecutorService service= Executors.newFixedThreadPool(3);
        /*In cyclicBarrier if there is a count of 4, atleast 4 thread needed in block to release barrier
        * In this program: if the count of Thread we reduce less than 4, barrier will not open, if we don't metion waiting time
        * */
        CyclicBarrier barrier=new CyclicBarrier(4,() -> System.out.println("barrier Opening..."));
        List<Future<String>> futures=new ArrayList<>();

        try {
            for (int i = 0; i <4 ; i++) {
                Friend friend=new Friend(barrier);
                futures.add(service.submit(friend));
            }

            futures.forEach(stringFuture -> {
                try {
                    stringFuture.get(200,TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (TimeoutException e) {
                    System.out.println("Time Out");
                    stringFuture.cancel(true);
                }
            });
        } finally {
            service.shutdown();
        }
    }
}
