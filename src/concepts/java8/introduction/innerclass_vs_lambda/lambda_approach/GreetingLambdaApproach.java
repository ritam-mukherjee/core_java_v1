package concepts.java8.introduction.innerclass_vs_lambda.lambda_approach;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 * Created by PouRit on 05-11-2017.
 */
interface Greeting {
    public void greet(Greeter greeter);
}

class Greeter {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void perform(Greeting greeting) {
        greeting.greet(this);
    }

}

public class GreetingLambdaApproach {
    public static void main(String[] args) {

        /*Lambda function of Greeting*/
        Greeting greeting = greeter -> System.out.println("Hello " + greeter.getName());

        System.out.println("-----------------Approach 1--------------------");
        BiFunction<Greeter, String, Greeter> setGreeterName = (greeter, s) -> {
            greeter.setName(s);
            return greeter;
        };

        Greeter g = new Greeter();
        setGreeterName.apply(g, "Ritam Mukherjee");
        greeting.greet(g);


        System.out.println("-----------------Approach 2--------------------");
        BiConsumer<Greeter, String> greetingBiConsumer = (greeter, s) -> {
            greeter.setName(s);
            greeting.greet(greeter);
        };
        greetingBiConsumer.accept(new Greeter(), "Poulami Mukherjee ");

        System.out.println("-----------------Approach 3--------------------");
        BiConsumer<Greeter, Greeting> greeterGreetingBiConsumer = (greeter, greeting1) -> {
            greeting1.greet(setGreeterName.apply(greeter, "Astha Kharoo"));

        };
        greeterGreetingBiConsumer.accept(new Greeter(), greeter -> System.out.println("hi " + greeter.getName()));


    }
}
