package interview_programs.hacker_rank.algorithm_probs.warmup;
import java.util.Scanner;

/**
 * Source   :   HackerRank
 * Link     :   https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
public class Diagonal_Difference {

    static int diagonalDifference(int[][] arr) {

        int first_diagonal=0;
        int second_diagonal=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(i==j)
                    first_diagonal=first_diagonal+arr[i][j];
                if(j==(arr[i].length-i-1))
                    second_diagonal=second_diagonal+arr[i][j];
            }

        }
        System.out.println(first_diagonal);
        System.out.println(second_diagonal);
        return Math.abs(first_diagonal-second_diagonal);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
