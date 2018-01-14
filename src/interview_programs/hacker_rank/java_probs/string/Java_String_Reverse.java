package interview_programs.hacker_rank.java_probs.string;


import java.util.Scanner;
import java.util.function.*;

/**
 *  Source  :   HackerRank
 *  Link    :   https://www.hackerrank.com/challenges/java-string-reverse/problem
 */

public class Java_String_Reverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        /*utility methods*/
        BiPredicate<String,String> isEqual=String ::equalsIgnoreCase;
        Supplier<String> yes=() -> "YES";
        Supplier<String> no=()->"NO";
        Consumer<String> printer=System.out::println;

        String input=scanner.next();
        Function<char[],char[]> reverse=chars -> {
            char[] rev=new char[chars.length];
            for (int i=chars.length-1; i >=0; i--) {
                rev[chars.length-i-1]=chars[i];
            }
            return rev;

        };


        printer.accept(isEqual.test(input,new String(reverse.apply(input.toCharArray())))?yes.get():no.get());

    }
}
