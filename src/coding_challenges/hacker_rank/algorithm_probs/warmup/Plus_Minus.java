package coding_challenges.hacker_rank.algorithm_probs.warmup;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class Plus_Minus {

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        /*
         * Write your code here.
         */

        Function<Double,String> floating_point_convert=aDouble -> String.format("%.6f",aDouble);
        Consumer<String> printer=System.out::println;

        int counter_positive=(int)Arrays.stream(arr).filter(value -> value>0).count();
        int counter_negative=(int)Arrays.stream(arr).filter(value -> value<0).count();
        int counter_zero=(int)Arrays.stream(arr).filter(value -> value==0).count();

        DecimalFormat df = new DecimalFormat("%.6f");


        printer.accept(floating_point_convert.apply((double)counter_positive/6));
        printer.accept(floating_point_convert.apply((double)counter_negative/6));
        printer.accept(floating_point_convert.apply((double)counter_zero/6));
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}
