package concepts.threads.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ritmukherjee on 1/9/2017.
 */
public class Thread_RentrantLock_WithTime_2 {

    public static void main(String[] args) {
         ReentrantLock rl=new ReentrantLock();

            Runnable runnable=()-> {

                try {
                    if (rl.tryLock(10000, TimeUnit.MILLISECONDS)) {
                        System.out.println(Thread.currentThread().getName() +
                                ".. got lock performing safe operation");
                        rl.lock();
                        for (int i = 0; i < 5; i++) {
                            try {
                                System.out.println(Thread.currentThread().getName() +
                                        " now executing :" + i);
                                Thread.sleep(1000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        rl.unlock();
                    } else {
                        System.out.println(Thread.currentThread().getName() +
                                ".. unable to get lock");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };


        new Thread(runnable,"First_Thread").start();/*Constructor usage:Thread(Runnable target, String name)*/
        new Thread(runnable,"Second_Thread").start();
    }
}
