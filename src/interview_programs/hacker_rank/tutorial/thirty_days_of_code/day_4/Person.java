package interview_programs.hacker_rank.tutorial.thirty_days_of_code.day_4;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * Source   :   HackerRank
 * Link     :   https://www.hackerrank.com/challenges/30-class-vs-instance/problem
 */
public class Person {
    private int age;
    private String status;

    Predicate<Integer> ageChecker=age -> age<0;
    Consumer<String> printer=System.out::println;
    Supplier<String> young=() -> "You are young.";
    Supplier<String> teenage=() -> "You are a teenager.";
    Supplier<String> old=() -> "You are old.";
    Supplier<String> invalid_age=() -> "Age is not valid, setting age to 0.";

    UnaryOperator<Integer> year_add=integer -> integer+1;

    public Person(int initialAge) {
        // Add some more code to run some checks on initialAge
        if(ageChecker.test(initialAge))
            printer.accept(invalid_age.get());
       this.setAge(ageChecker.test(initialAge)?0:initialAge);

    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        this.setStatus((age>=0 &&age<13)?young.get():((age>=13&&age<18)?teenage.get():old.get()));
        printer.accept(status);
    }

    public void yearPasses() {
        // Increment this person's age.
        this.setAge(year_add.apply(this.getAge()));
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();

        for (int i = 0; i < T; i++) {
        int age= scanner.nextInt();

        Person p=new Person(age);
        p.amIOld();
            for (int j = 0; j <3 ; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        scanner.close();
    }
}
