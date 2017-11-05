package concepts.java8.miscellaneous.CollectionIterationApproaches;

import java.util.*;
import java.util.function.Consumer;

/**
 * Created by PouRit on 04-11-2017.
 */

public class CollectionIterationDifferentApproaches {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Sam", "Sharma", 22),
                new Person("Ravi", "Kumar", 25),
                new Person("Gopal", "Thakur", 28)
        );

        /*Approach 1:   Legacy approach since Java 1*/
        System.out.println("---------------Approach 1------------------------");
        Enumeration enumeration = Collections.enumeration(persons);
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

       /* Approach 2:   iterator approach Java 1.2 onwards:Type Casting required*/
        System.out.println("---------------Approach 2------------------------");
        Iterator itr = persons.iterator();
        while (itr.hasNext()) {
            Person person = (Person) itr.next();
            System.out.println(person);
        }

       /* Approach 3:   External Iteration:iterator with generics approach:Type Casting not required*/
        System.out.println("---------------Approach 3------------------------");
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*Approach 4:   classic Extended For Lopp or for loop approach*/
        System.out.println("---------------Approach 4------------------------");
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }

        /*Approach 5:   foreach loop approach java 1.5 onwards*/
        System.out.println("---------------Approach 5------------------------");
        for (Person person : persons) {
            System.out.println(person);
        }

        /*Approach 6:   Internal Iteration: lambda expression approach java 1.8 onwards*/
        System.out.println("---------------Approach 6------------------------");
        persons.forEach((person -> System.out.println(person)));

        /*Approach 7:   method reference approach java 1.8 onwards*/
        System.out.println("---------------Approach 7------------------------");
        persons.forEach(System.out::println);

       /* Approach 8:   lambda expression with help of stream java 1.8 onwards*/
        System.out.println("---------------Approach 8------------------------");
        persons.stream().forEach(System.out::println);
    }
}
