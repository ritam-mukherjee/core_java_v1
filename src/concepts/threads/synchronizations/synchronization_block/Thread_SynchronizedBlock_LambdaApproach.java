package concepts.threads.synchronizations.synchronization_block;

import java.util.function.Consumer;

interface iWishNameThread {
    public void  doWishName(String name);
}

interface iDisplayName {
    public void doNameDisplay(iWishNameThread iWishNameThread, String name);
}
public class Thread_SynchronizedBlock_LambdaApproach {
    public static void main(String[] args) {
        Consumer<String> print=name -> System.out.println("good Morning "+name);

        iWishNameThread iWishNameThread =name -> {
            for (int i = 0; i < 5; i++) {

                try {
                    Thread.sleep(2000);
                }catch (InterruptedException ie){
                    System.out.println(ie);
                }
                print.accept(name);
            }
        };
        iDisplayName iDisplayName =(wishNameThread1, name) -> {
            new Thread(() -> {
                synchronized (wishNameThread1) {
                    wishNameThread1.doWishName(name);
                }
            },name).start();
        };
        iDisplayName.doNameDisplay(iWishNameThread,"tina");
        iDisplayName.doNameDisplay(iWishNameThread,"poulami");
    }
}
