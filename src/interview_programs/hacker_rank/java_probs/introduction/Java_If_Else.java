package interview_programs.hacker_rank.java_probs.introduction;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Source   :   HackerRank
 * Link     :https://www.hackerrank.com/challenges/java-if-else/problem
 */
public class Java_If_Else {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        final String weired = "Weird";
        final String not_weired = "Not Weird";


        Predicate<Integer> checkOdd = integerl -> (integerl % 2) == 1; // Creating predicate

        Predicate<Integer> evenWiredRange = integerl -> (integerl >= 6) && (integerl <= 20);

        Predicate<Integer> evenNotWiredRange = integerl -> (integerl >= 2) && (integerl <= 5) || integerl > 20;


        Consumer<String> printer = System.out::println;
        printer.accept(checkOdd.test(input)
                ? weired : (evenWiredRange.test(input)
                ? weired : evenNotWiredRange.test(input)
                ? not_weired : null));


    }
}