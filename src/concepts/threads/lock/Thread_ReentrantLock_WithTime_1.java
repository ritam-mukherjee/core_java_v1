package concepts.threads.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ritmukherjee on 1/9/2017.
 */

public class Thread_ReentrantLock_WithTime_1 {
    static ReentrantLock rl=new ReentrantLock();
    static int attempt=1;
    static Thread createThread(String name){
        Thread thread=new Thread(
            /* First parameter:RunnableObject     */
                ()->{
                    do{
                        try {
                            if(rl.tryLock(5000, TimeUnit.MILLISECONDS)){
                                System.out.println(Thread.currentThread().getName() +
                                        ".. got lock ");
                                Thread.sleep(30000);
                                System.out.println(Thread.currentThread().getName() +".. release lock ");
                                rl.unlock();
                                attempt=0;
                                break;
                            }else{
                                System.out.println("Attempt:"+attempt+", "+ Thread.currentThread().getName()+
                                        ".. unable to get lock" );
                                attempt++;
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }while(true);
        }
            /*Second parameter:name*/
         ,name);
        return thread;
    }
    public static void main(String[] args) {
        createThread("FirstThread").start();
        createThread("SecondThread").start();
    }
}
