package concepts.threads.synchronizations.synchronization_method;

import java.util.function.Consumer;

/**
 * Created by ritmukherjee on 1/23/2017.
 */

interface iWishNameThread {
    public void  doWishName(String name);
}

interface iDisplayName {
    public void doNameDisplay( String name);
}

public class Thread_SynchronizedMethod_LambdaApproach {


    public static synchronized void doWish(String name){
        Consumer<String> print=name1 -> System.out.println("good Morning "+name1);
       iWishNameThread iWishNameThread =name2 -> {
           for (int i = 0; i < 5; i++) {

               try {
                   Thread.sleep(2000);
               }catch (InterruptedException ie){
                   System.out.println(ie);
               }
               print.accept(name2);
           }
       };

        iWishNameThread.doWishName(name);

   }

    public static void main(String[] args) {
        iDisplayName iDisplayName =(name) -> {
            new Thread(() -> {
                doWish(name);
            },name).start();
        };

        iDisplayName.doNameDisplay("tina");
        iDisplayName.doNameDisplay("poulami");
    }
}
