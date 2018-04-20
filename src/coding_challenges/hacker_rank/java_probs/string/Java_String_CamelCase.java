package coding_challenges.hacker_rank.java_probs.string;

import java.util.Scanner;

/**
 * Link   :   https://www.hackerrank.com/challenges/camelcase/problem
 *
 */


public class Java_String_CamelCase {

    static int camelcase(String s) {

/*        int initial= ((int)s.charAt(0))>=97 &&  ((int)s.charAt(0))<=122?1:0;
        int other=        (int)s.chars() //IntStream
                .mapToObj(x -> (int) x)//Stream<Character>
                .filter(integer -> integer>=65 && integer<97)
                // .forEach(System.out::println);
                .count();

        int num=(((int)s.charAt(0))>=97 &&  ((int)s.charAt(0))<=122?1:0 )+
                (int)s.chars() //IntStream
                        .mapToObj(x -> (int) x)//Stream<Character>
                        .filter(integer -> integer>=65 && integer<97)
                        // .forEach(System.out::println);
                        .count();
        System.out.println(num);
        System.out.println(initial);
        System.out.println(other);

        System.out.println(((int)s.charAt(0))>97?1:0);*/

        return (((int)s.charAt(0))>=97 &&  ((int)s.charAt(0))<=122?1:0 )+
                (int)s.chars() //IntStream
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
