package concepts.threads.cyclic_barrier.runner_service;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BiConsumer;

interface iCyclicBarrier{

    void doCycilicBarrier(Runnable r,CyclicBarrier cb,String name);
}

public class Thread_CyclicBarrier_Ruuner_ClassApproach {

    public static void main(String[] args) {


        class Runner implements Runnable{
            CyclicBarrier cyclicBarrier;

            @Override
            public void run() {
                try {

                    Thread.sleep(5000);
                    System.out.println("runner taking rest");
                    cyclicBarrier.await();
                    System.out.println("runner started running");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }

            public CyclicBarrier getCyclicBarrier() {
                return cyclicBarrier;
            }

            public void setCyclicBarrier(CyclicBarrier cyclicBarrier) {
                this.cyclicBarrier = cyclicBarrier;
            }
        }

        BiConsumer<Runner,CyclicBarrier>  barrier_consumer=(runner1, cyclicBarrier) -> {
             runner1.setCyclicBarrier(cyclicBarrier);
       };
        ExecutorService service= Executors.newFixedThreadPool(3);
        try {
            CyclicBarrier cb=new CyclicBarrier(3);

            for (int i = 0; i < 3; i++) {
                Runner runner=new Runner();
                barrier_consumer.accept(runner,cb);
                service.submit(runner);
            }
        } finally {
                service.shutdown();
        }


        System.out.println("--------------------");
    }

}
