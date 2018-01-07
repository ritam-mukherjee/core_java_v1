package interview_programs.hacker_rank.java_probs.introduction;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * https://www.hackerrank.com/challenges/java-loops-i/problem
 */
public class Java_Loop_I {
    public static void main(String[] args) {
        Consumer<String> printConsumer=System.out::println;
        BiFunction<Integer,Integer,Integer> doMultiplication=(integer1, integer2) -> integer1*integer2;
        Consumer<Integer> inputConsumer=input -> {
            int count=1;
            while(count<=10){
                printConsumer.accept(input+" "+"x"+" "+count+" = "+doMultiplication.apply(input,count));
                count++;
            }
        };
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        inputConsumer.accept(input);
    }
}
