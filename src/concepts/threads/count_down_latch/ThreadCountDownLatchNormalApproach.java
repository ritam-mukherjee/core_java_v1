package concepts.threads.count_down_latch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by PouRit on 09-11-2017.
 */

class Processor implements Runnable{
    private CountDownLatch countDownLatch;

    public Processor(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
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
    }
}
public class ThreadCountDownLatchNormalApproach {
    public static void main(String[] args) {
        CountDownLatch latch=new CountDownLatch(3);
        ExecutorService service= Executors.newFixedThreadPool(1);
        for (int i = 1; i <= 3; i++) {
            service.submit(new Processor(latch));
        }
        try {
            latch.await(); /* waiting to make count down latch 0*/
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("<><><><><><><><>complete<><><><><><><><>");
    }
}
