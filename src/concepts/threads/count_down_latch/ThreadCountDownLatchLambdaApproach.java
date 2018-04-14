package concepts.threads.count_down_latch;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 * Created by PouRit on 09-11-2017.
 */
public class ThreadCountDownLatchLambdaApproach {
    public static void main(String[] args) {

        CountDownLatch countDownLatch=new CountDownLatch(3);

        Runnable runnable=() -> {
            System.out.println("---------------------------------------------------");
            Thread.currentThread().setName("Thread_"+countDownLatch.getCount());
            System.out.println(Thread.currentThread().getName() + " has started,\'Latch count\':" + countDownLatch.getCount());
            try {
                Thread.sleep(10000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            countDownLatch.countDown();
            System.out.println(Thread.currentThread().getName() + "has reduced count,'Latch count':" + countDownLatch.getCount());
            System.out.println("------------------------------------------------------");
        };



        ExecutorService service=Executors.newFixedThreadPool(1);
        for (int i = 1; i <= 3; i++) {
            service.submit(runnable);
        }
        try {
            countDownLatch.await(); /* waiting to make count down latch 0*/
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("<><><><><><><><><>complete<><><><><><><><><>");
    }
}
