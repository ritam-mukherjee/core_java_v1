package concepts.threads.basics;

import java.util.function.BiConsumer;
/**
source  :   udemy
 */
public class Thread_Program_1 {
    public static void main(String[] args) throws InterruptedException {
        BiConsumer<String,String> print=(color, name) ->
                System.out.println(color+" Name: "+name+" is running");
        Runnable runnable_red=() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(500);
                    print.accept(ThreadColor.ANSI_RED,Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable runnable_green=() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(500);
                    print.accept(ThreadColor.ANSI_GREEN,Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread red_thread=new Thread(runnable_red,"RED_THREAD");
        Thread green_thread=new Thread(runnable_green,"GREEN_THREAD");
        red_thread.start();
        green_thread.start();
        Thread.sleep(1000);
        System.out.println(ThreadColor.ANSI_CYAN+"main thread is executing");
    }
}
