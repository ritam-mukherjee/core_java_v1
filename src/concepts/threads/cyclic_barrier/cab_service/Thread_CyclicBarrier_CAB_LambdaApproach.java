package concepts.threads.cyclic_barrier.cab_service;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by ritmukherjee on 1/15/2017.
 */
interface iCabService {
    public void cabInvoke(String name, CyclicBarrier cyclicBarrier);
}

public class Thread_CyclicBarrier_CAB_LambdaApproach {
    public static void main(String[] args) {

           /*If the CyclicBarrier count is 3 then thread will not stop at barrier
                otherwise if the barrier count is more than barrier will stop the execution*/
        CyclicBarrier barrier=new CyclicBarrier(3);

        ExecutorService service= Executors.newFixedThreadPool(3);
        iCabService iCabService =(name, cyclicBarrier) -> {

            service.submit(()-> {
                Thread.currentThread().setName(name);
                System.out.println(Thread.currentThread().getName()+" has started");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" has over");
            });
        };
        try {
            iCabService.cabInvoke("ola",barrier);
            Thread.sleep(5000);
            iCabService.cabInvoke("uber", barrier);
            Thread.sleep(5000);
            iCabService.cabInvoke("meru",barrier);
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            service.shutdown();
        }

        System.out.println(Thread.currentThread().getName()+" is resume its execution");
    }
}
