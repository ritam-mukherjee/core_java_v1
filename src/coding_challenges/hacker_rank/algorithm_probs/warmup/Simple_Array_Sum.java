package coding_challenges.hacker_rank.algorithm_probs.warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Source   :   hackerrank
 * URL      : https://www.hackerrank.com/challenges/simple-array-sum/problem
 */
public class Simple_Array_Sum {

    static int simpleArraySum(int n, int[] ar) {

        return Arrays.stream(ar).sum();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, ar);
        System.out.println(result);
    }

}
