package coding_challenges.hacker_rank.java_probs.introduction;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;


/**
 * Link     :   https://www.hackerrank.com/challenges/java-int-to-string/problem
 * Source   :   HackerRank
 */

public class Java_Int_to_String {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt();

        Function<Integer, String> intToStringConverter = String::valueOf;


        Function<Integer, String> intToStringConverter2 = Object::toString;

        Predicate<Integer> checkRange = integer -> integer >= -100 && integer <= 1000;

        String s = checkRange.test(input) ? intToStringConverter.apply(input) : null;

        System.out.println(s);
    }
    }
