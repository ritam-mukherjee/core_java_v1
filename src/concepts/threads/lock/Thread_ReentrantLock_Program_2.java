package concepts.threads.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ritmukherjee on 11/27/2016.
 */
class LockingThread extends Thread {

    static ReentrantLock rl=new ReentrantLock();

    String name;

    public LockingThread(String name){
        super(name);
    }
    public void run(){
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
    }
}

public class Thread_ReentrantLock_Program_2 {
    public static void main(String[] args) {
        LockingThread ritamthread=new LockingThread("ritam");
        LockingThread poulamithread=new LockingThread("poulami");
        ritamthread.start();
        poulamithread.start();
    }
}
