package interview_programs.hacker_rank.dta_structure_probs.arrays;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
/**
 * Source   :   HackerRank
 * Url      :   https://www.hackerrank.com/challenges/2d-array/problem
 */
public class Arrays_2D_Array {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Integer arr[][] = new Integer[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        Consumer<Integer> printConsumer = System.out::println;
        Function<Integer[][], Integer> getBigSum = array -> {
            int max_sum = Integer.MIN_VALUE; // intialize with 0 create problem if all values are negetive
            for (int i = 0; i < (array.length - 2); i++) {
                for (int j = 0; j < (array[i].length - 2); j++) {
                    /*Hour glass sum calculation*/
                    int sum = (array[i][j] + array[i][j + 1] + array[i][j + 2])
                            + array[i + 1][j + 1] +
                            (array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2]);

                    if (sum > max_sum)
                        max_sum = sum;
                }
            }
            return max_sum;
        };

        printConsumer.accept(getBigSum.apply(arr));


    }
}
