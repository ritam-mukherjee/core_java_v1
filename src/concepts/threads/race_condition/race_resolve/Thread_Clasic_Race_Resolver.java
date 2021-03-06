package concepts.threads.race_condition.race_resolve;

import java.util.function.Supplier;
class LongWrapper {
    private Object key=new Object(); //explicitly lock object creation
    private long l;
    public LongWrapper(long l) {this.l = l;}  // parameterize constructor
    public long getValue() {return l; }  //getter
    public void increment_value() {
        synchronized (key) {
            l = l + 1; //Read & Write Race Condition
        }
    }
}
public class Thread_Clasic_Race_Resolver {

    public static void main(String[] args) throws InterruptedException {

        Supplier<Long> threadSupplier = () -> {
            LongWrapper longWrapper = new LongWrapper(0L);
            Runnable runnable = () -> {
                for (int i = 0; i < 1_000; i++) {
                    longWrapper.increment_value();
                }
            };
            /*1000 threads we are going to create with same runnable object and start*/
            Thread[] threads = new Thread[1_000];
            for (int i = 0; i < threads.length; i++) {
                threads[i] = new Thread(runnable);
                threads[i].start();
            }
            /*All threads should execute*/
            for (int i = 0; i < threads.length; i++) {
                try {
                    threads[i].join();
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
            return longWrapper.getValue();
        };
        System.out.println(threadSupplier.get());
        System.out.println(threadSupplier.get());
        System.out.println(threadSupplier.get());
        System.out.println(threadSupplier.get());
    }
}
