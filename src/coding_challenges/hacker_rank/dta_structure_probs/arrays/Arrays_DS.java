package coding_challenges.hacker_rank.dta_structure_probs.arrays;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Source   : HackerRank
 * Link     : https://www.hackerrank.com/challenges/arrays-ds/problem
 */

public class Arrays_DS {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size= scanner.nextInt();
        int[] array=new int[size];
        scanner.nextLine();
        String input=scanner.nextLine();
        String[] inputs=input.split(" ");

        Function<String,Integer> change=Integer::parseInt;
        Consumer<Object> printer=System.out::print;

        for(int i=inputs.length-1;i>=0;i--){
            array[size-i-1]=change.apply(inputs[i]);
        }
        for (int i:array) {
            printer.accept(i);
            printer.accept(" ");
        }

    }
}
