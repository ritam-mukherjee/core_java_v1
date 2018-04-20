package coding_challenges.hacker_rank.java_probs.string;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Source      :    HackerRank
 * URL          :   https://www.hackerrank.com/challenges/java-substring/problem
 */

public class Java_Substring {
    public static void main(String[] args) {

        /*utility functions*/
        Function<String,Integer> intConverter=Integer::parseInt;
        Consumer<String> printer=System.out::println;

        Scanner scanner=new Scanner(System.in);

        String word=scanner.next();
        scanner.nextLine();
        String[] split_index=scanner.nextLine().split(" ");


        BiFunction<String,String[],String> splitter=(input, range) -> {
            return  input.substring(intConverter.apply(range[0]),intConverter.apply(range[1]));
        };

        printer.accept(splitter.apply(word,split_index));

    }
}
