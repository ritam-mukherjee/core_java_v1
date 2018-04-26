package concepts.java8.data_processing;

import java.util.Comparator;


public class DataProcessingExample_1 {
    public static void main(String[] args) {

        PersonList personList=new PersonList();

        System.out.println(ColourProcessor.ANSI_RED+"Print elements of list  :");
        personList.getPersons()
                .forEach(System.out::println);


        System.out.println(ColourProcessor.ANSI_YELLOW+"\nSorting by Normal order    :");
        personList.getPersons()
                .sort(Comparator.comparingInt(Person::getAge)
                                .thenComparing(Person::getFirstname)
                                .thenComparing(Person::getLastname))
                ;

        personList.getPersons()
                .forEach(System.out::println);


        System.out.println(ColourProcessor.ANSI_BLUE+"\nSorting by Reverse order    :");
        personList.getPersons()
                .sort(Comparator.comparingInt(Person::getAge)
                        .thenComparing(Person::getFirstname)
                        .thenComparing(Person::getLastname).reversed())
        ;

        personList.getPersons()
                .forEach(System.out::println);


        System.out.println(ColourProcessor.ANSI_CYAN+"\nReplacing Uppercase Character   :");
        personList.getPersons()
                .replaceAll(person ->
                        new Person(
                                person.getFirstname().toUpperCase(),
                                person.getLastname().toUpperCase(),
                                person.getAge()));

        personList.getPersons()
                .forEach(System.out::println);

        System.out.println(ColourProcessor.ANSI_BLACK+"\nFiltering elements of list    :");

        personList.getPersons().removeIf(person -> person.getAge()<30);

        personList.getPersons()
                .forEach(System.out::println);

    }
}
