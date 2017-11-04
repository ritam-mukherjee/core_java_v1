package concepts.java8.method_reference;

/**
 * Created by PouRit on 04-11-2017.
 */
public class MethodReferenceIntroduction {
    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        System.out.println("Approach 1: the thread call sayHello() method");
        new Thread(new Runnable() {
            @Override
            public void run() {
                sayHello();
            }
        }).start();


        /**
         * Approach 1: Normal Lambda Expression Approach:
         * Thread takes no arg input and call sayHello() method*/
        System.out.println("Approach 2: the thread call sayHello() method by lambda expression");
        new Thread(() -> sayHello()).start();


        /**
         * Approach 2: Method Reference  Approach:
         * Passing sayHello() method of "MethodReferenceIntroduction.class' as parameter*/
        System.out.println("Approach 3: we are passing sayHello() method as parameter");
        new Thread(MethodReferenceIntroduction::sayHello).start();


    }

}
