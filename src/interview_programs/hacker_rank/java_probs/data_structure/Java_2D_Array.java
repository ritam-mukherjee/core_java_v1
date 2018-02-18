package interview_programs.hacker_rank.java_probs.data_structure;


import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Source   :   HackerRank
 * Url      :   https://www.hackerrank.com/challenges/java-2d-array/problem
 */
public class Java_2D_Array {
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


   /*     Integer[][] arr=new Integer[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };


        Integer[][] array2=new Integer[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 9, 2, -4, -4, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, -1, -2, -4, 0},
        };

        /*  int f=1, i=2;
        while(++i<5)
            f*=i;
        System.out.println(f);*/
        */