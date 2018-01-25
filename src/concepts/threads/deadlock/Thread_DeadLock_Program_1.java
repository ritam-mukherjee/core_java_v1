package concepts.threads.deadlock;

import java.util.function.BiConsumer;

/**
 * source PluralSight
 */
class DeadLock{

    private Object key1=new Object();
    private Object key2=new Object();

    public void A(){
        synchronized (key1){
            System.out.println("I am in "+ Thread.currentThread().getName()+" at A() method");
            B();
        }
    }
    public void B(){
        synchronized (key2){
            System.out.println("I am in "+ Thread.currentThread().getName()+" at B() method");
            C();
        }
    }
    public void C(){
        synchronized (key1){
            System.out.println("I am in "+ Thread.currentThread().getName()+" at C() method");
        }
    }
}
public class Thread_DeadLock_Program_1 {

    public static void main(String[] args) throws InterruptedException {
            DeadLock deadLock=new DeadLock();
            Runnable runnableA=() -> deadLock.A();
            Runnable runnableB=() -> deadLock.B();

            Thread threadA=new Thread(runnableA);
            threadA.start();

            Thread threadB=new Thread(runnableB);
            threadB.start();

            threadA.join();
            threadB.join();

    }
}
