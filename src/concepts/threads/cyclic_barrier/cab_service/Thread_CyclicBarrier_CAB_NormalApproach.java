package concepts.threads.cyclic_barrier.cab_service;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by PouRit on 11-11-2017.
 */
class CabService implements Runnable{
    private String name;
    private CyclicBarrier cb;

    public CabService(String name, CyclicBarrier cb) {
        this.name = name;
        this.cb = cb;
    }

    @Override
    public void run() {
        System.out.println(name +" is started running");
        try {
            cb.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println(name+"run is over");
    }
}

public class Thread_CyclicBarrier_CAB_NormalApproach {
    public static void main(String[] args) {
        CyclicBarrier cb=new CyclicBarrier(3);
        Thread olathread=new Thread(new CabService("ola",cb));
        Thread uberThread=new Thread(new CabService("uber",cb));
        Thread meruThread=new Thread(new CabService("mru",cb));


        try {
            olathread.start();
            Thread.sleep(10000);
            uberThread.start();
            Thread.sleep(10000);
            meruThread.start();
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main is executing");
    }

}
