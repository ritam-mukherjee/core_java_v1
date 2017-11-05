package concepts.java8.introduction.innerclass_vs_lambda.inner_class_approach;

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

    public Greeter(String name) {
        this.name = name;
    }

    public void perform(Greeting greeting) {
        greeting.greet(this);
    }

}

public class GreetingInnerclassApproach {
    public static void main(String[] args) {

        Greeting greeting = new Greeting() {
            @Override
            public void greet(Greeter greeter) {
                System.out.println("Hello " + greeter.getName());
            }
        };

        new Greeter("ritam").perform(greeting);
    }
}
