package coding_challenges.hacker_rank.java_probs.data_structure;

import java.util.Scanner;
import java.util.function.Predicate;

/**
 * Source   :   HackerRank
 * URL      :   https://www.hackerrank.com/challenges/java-negative-subarray/problem
 */


public class Java_Subarray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size= scanner.nextInt();
        int[] array=new int[size];
        scanner.nextLine();
        String input=scanner.nextLine();
        String[] inputs=input.split(" ");

        int n=inputs.length;
        int counter=0;

        Predicate<Integer> isNegetive=integer -> integer<0;
        // Pick starting point
        for (int i=0; i <n; i++)
        {
            // Pick ending point
            for (int j=i; j<n; j++)
            {
                int result=0;
                // sum subarray between current
                // starting and ending points
                for (int k=i; k<=j; k++) {
                    result += Integer.parseInt(inputs[k]);
                }
                if(isNegetive.test(result))
                    counter++;

            }
        }

        System.out.println(counter);


    }

}
