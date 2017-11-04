package concepts.java8.method_reference;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by PouRit on 04-11-2017.
 */
class HelloName {
    public static String sayHello(String nam) {
        return "Hello " + nam;
    }
}

interface NumberProcessing {
    static String doAdd(Integer a, Integer b) {
        int c = a + b;
        return "The sum is :" + c;
    }

}

public class MethodeReferenceWithParameter {

    public static void main(String[] args) {

        Consumer<String> printConsumer = System.out::println;

       /* helloFunction internally call sayHello() method of NumberProcessing*/
        Function<String, String> helloFunction = HelloName::sayHello;

        /*numberFunction is a instance of BiFunction which call daAdd method and pass two parameters*/
        BiFunction<Integer, Integer, String> numberFunction = NumberProcessing::doAdd;


        printConsumer.accept(helloFunction.apply("Ritam Mukherjee"));
        printConsumer.accept(numberFunction.apply(10, 20));

    }
}
