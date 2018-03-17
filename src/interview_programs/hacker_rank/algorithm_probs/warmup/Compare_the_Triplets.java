package interview_programs.hacker_rank.algorithm_probs.warmup;

/**
 * Source   :   HackerRank
 * link :   https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */

import java.io.IOException;
import java.util.Scanner;

public class Compare_the_Triplets {

    /*
     * Complete the solve function below.
     */
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        /*
         * Write your code here.
         */

        int alice_point=((a0>b0)?1:0 )+((a1>b1)?1:0 )+((a2>b2)?1:0 );
        int bob_point=((b0>a0)?1:0 )+((b1>a1)?1:0 )+((b2>a2)?1:0 );

        return new int[]{alice_point,bob_point};
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] a0A1A2 = scan.nextLine().split(" ");

        int a0 = Integer.parseInt(a0A1A2[0].trim());

        int a1 = Integer.parseInt(a0A1A2[1].trim());

        int a2 = Integer.parseInt(a0A1A2[2].trim());

        String[] b0B1B2 = scan.nextLine().split(" ");

        int b0 = Integer.parseInt(b0B1B2[0].trim());

        int b1 = Integer.parseInt(b0B1B2[1].trim());

        int b2 = Integer.parseInt(b0B1B2[2].trim());

        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print((result[i]>0?1:"") + (i != result.length - 1 ? " " : ""));
        }
    }
}
