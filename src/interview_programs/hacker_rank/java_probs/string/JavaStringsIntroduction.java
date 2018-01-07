package interview_programs.hacker_rank.java_probs.string;

/**
 * https://www.hackerrank.com/domains/java/java-strings
 */

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Consumer<String> printConsumer=System.out::println;
        printConsumer.accept("Enter String A");
        String A=sc.next();

        printConsumer.accept("Enter String B");
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */



        BiFunction<char[],char[],Boolean> checkLexicographically=(chars1, chars2) -> {
            boolean flag=false;
            int count=0;

            while_loop:
            while(count<chars1.length &&  count<chars2.length){
                check_before:
                if((int)chars1[count]<(int)chars2[count]) {
                    flag=false;
                    break while_loop;
                }
                check_after:
                if((int)chars1[count]>(int)chars2[count]) {
                    flag=true;
                    break while_loop;
                }
                else{
                    count++;
                }
            }
            return flag;
        };

        Function<String,String> doInitCap=s -> s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase());

        printConsumer.accept(String.valueOf(A.length()+ B.length()));
        printConsumer.accept(checkLexicographically.apply(A.toCharArray(),B.toCharArray())?"Yes":"No");
        printConsumer.accept(doInitCap.apply(A).concat(" ").concat(doInitCap.apply(B)));

    }
}
