package concepts.threads.producer_consumer.pluralsight_programs.producer_consumer_deadlock;

/**
 * Source       :   PluralSight
 */
public class Thread_ProducerConsumer_Deadlock {

    private static Object lock = new Object();

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    private static int[] buffer;
    private static int count;

    static class Producer {
        void produce() {
            synchronized (lock) {
                while (isFull(buffer)) {
                }
                buffer[count++] = 1;
            }

        }
    }

    static class Consumer {

        void consume() {
            synchronized (lock) {
                while (isEmpty(buffer)) {

                }
                buffer[--count] = 0;
            }
        }
    }

    static boolean isEmpty(int[] buffer) {
        return count == 0;
    }

    static boolean isFull(int[] buffer) {
        return count == buffer.length;
    }

    public static void main(String[] args) throws InterruptedException {
        buffer = new int[10];
        count = 0;

        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        Runnable produceTask = () -> {
            for (int i = 0; i < 50; i++) {
                producer.produce();
            }
            System.out.println(ANSI_GREEN + " Producing Done");
        };

        Runnable consumeTask = () -> {
            for (int i = 0; i < 50; i++) {
                consumer.consume();
            }
            System.out.println(ANSI_RED + " Consuming Done");
        };

        Thread producer_thread = new Thread(produceTask);
        Thread consumer_thread = new Thread(consumeTask);

        consumer_thread.start();
        producer_thread.start();

        consumer_thread.join();
        producer_thread.join();

        System.out.println(ANSI_CYAN + "Data in the buffer is   :" + count);
/**
 * here is a chance of getting deadlocK
 */

    }
}
