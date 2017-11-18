package concepts.threads.thread_pool;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BiConsumer;


interface IPrintJob{
    public void doPrint(String name);
}
public class Thread_ThreadPool_Program_1 {
    public static void main(String[] args) {
        BiConsumer<ExecutorService,Runnable> executorServiceBiConsumer=(service, runnable) -> service.submit(runnable);
        ExecutorService service= Executors.newFixedThreadPool(1);

        final CountDownLatch latch = new CountDownLatch(8);
         IPrintJob printJob=(job) -> {
             executorServiceBiConsumer.accept(service, new Thread(() -> {
                 System.out.println("This " + job + "is running by " + Thread.currentThread() + " going to sleep");
                 try {
                     Thread.sleep(10000);

                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 System.out.println("This " + job + "is running by " + Thread.currentThread() + " has waked up");
                 latch.countDown();
             }, job));
         };
        try {
            long start=System.currentTimeMillis();
            for (int i = 0; i < 8; i++) {
                printJob.doPrint("Job_"+i);
            }
            latch.await();
            long end=System.currentTimeMillis();
            System.out.println("Time Taken :" + (end - start));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
