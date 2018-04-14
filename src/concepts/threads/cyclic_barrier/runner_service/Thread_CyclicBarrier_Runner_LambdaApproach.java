package concepts.threads.cyclic_barrier.runner_service;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by ritmukherjee on 1/15/2017.
 */

interface iCyclicBarrierService {
    public void doThrading(String name,CyclicBarrier cyclicBarrier);
}

public class Thread_CyclicBarrier_Runner_LambdaApproach {
    public static void main(String[] args) throws InterruptedException {

        /*If the CyclicBarrier count is 3 then thread will not stop at barrier
                otherwise if the barrier count is more than barrier will stop the execution*/
        CyclicBarrier cb=new CyclicBarrier(3);
        iCyclicBarrierService barrierService=((name,cb1) -> {



            Runnable r1=()-> {
                System.out.println(Thread.currentThread().getName()+" has started");
                try {

                    cb1.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" has over");
            };

            Thread thread=new Thread(r1,name);
            thread.start();
          /*  thread.start();
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }*/
        });

        barrierService.doThrading("AA",cb);
        Thread.sleep(5000);
        barrierService.doThrading("BB",  cb);
        Thread.sleep(5000);
        barrierService.doThrading("CC", cb);
        Thread.sleep(5000);

        System.out.println(Thread.currentThread().getName()+" has started");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println(Thread.currentThread().getName()+" has over");


    }
}
