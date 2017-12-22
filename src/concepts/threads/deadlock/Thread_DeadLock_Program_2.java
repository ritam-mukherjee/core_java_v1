package concepts.threads.deadlock;

/**
 * Created by PouRit on 11-11-2017.
 */

class A{

    public synchronized void m1(B b)  {
        System.out.println(Thread.currentThread().getName()+" start Execution");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" try to call last() method");
        b.last();
    }
    public synchronized void last(){
        System.out.println("Inside A : call last() method");
    }
}

class B{
    public synchronized void m1(A a) {
        System.out.println(Thread.currentThread().getName()+" start Execution");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" try to call last() method");
        a.last();
    }
    public synchronized void last(){
        System.out.println("Inside B : call last() method");
    }
}
public class Thread_DeadLock_Program_2 extends Thread{
    A a=new A();
    B b=new B();

    public void m2(){
        this.start();
        a.m1(b);
    }
    @Override
    public void run() {

        b.m1(a);
    }

    public static void main(String[] args) {
    Thread_DeadLock_Program_2 deadlock=new Thread_DeadLock_Program_2();
        deadlock.m2();


    }
}
