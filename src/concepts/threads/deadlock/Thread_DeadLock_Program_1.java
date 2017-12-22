package concepts.threads.deadlock;

/**
 * Created by ritmukherjee on 12/4/2016.
 */
public class Thread_DeadLock_Program_1 {

    public static void main(String[] args) {
        String str1="JAVA";
        String str2="DOTNET";
        Thread t1=new Thread(()->
        {
            synchronized (str1){
                synchronized (str2){
                    str1.concat(str2);
                    System.out.println(str1.concat(str2));
                }
            }
        });
        Thread t2=new Thread(()->
        {
            synchronized (str1){
                synchronized (str2){
                    str1.concat(str2);
                    System.out.println(str2.concat(str1));
                }
            }
        });


        System.out.println("----------------------start-----------------------");
        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-------------------end------------------------");
    }
}
