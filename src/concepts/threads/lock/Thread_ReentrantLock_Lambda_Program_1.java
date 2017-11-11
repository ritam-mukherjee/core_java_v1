package concepts.threads.lock;

import concepts.threads.deadlock.Thread_DeadLock_Program_2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by PouRit on 11-11-2017.
 */
public class Thread_ReentrantLock_Lambda_Program_1 {
    public static void main(String[] args) {

        ReentrantLock rl = new ReentrantLock();

        Runnable runnable=() -> {
            if(rl.tryLock()) {
                System.out.println(Thread.currentThread().getName() +
                        ".. got lock performing safe operation");
                rl.lock();
                for (int i = 0; i < 4; i++) {
                    try {
                        System.out.println(Thread.currentThread().getName()+
                                " now executing :"+i);
                        Thread.sleep(10000);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
                rl.unlock();
            }else{
                System.out.println(Thread.currentThread().getName()+
                        ".. unable to get lock" );
            }
        };

        Thread first_thread=new Thread(runnable,"first_thread");
        Thread second_thread=new Thread(runnable,"second_thread");

        first_thread.start();
        second_thread.start();

    }
}
