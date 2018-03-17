package interview_programs.hacker_rank.java_probs.string;

import java.util.Scanner;

/**
 * Link   :   https://www.hackerrank.com/challenges/camelcase/problem
 *
 */


public class Java_String_CamelCase {

    static int camelcase(String s) {

        return (int)s.chars() //IntStream
                .mapToObj(x -> (int) x)//Stream<Character>
                .filter(integer -> integer>=65 && integer<97)
               // .forEach(System.out::println);
                .count();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}
