package coding_challenges.hackerearth.all_tracks.data_structures.arrays._1_d;

import java.util.Scanner;

/**
 * Source   :   hackerEarth
 * link     :   https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/monk-and-welcome-problem/
 */
public class Monk_and_Welcome_Problem {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);
        int array_length=sc.nextInt();

        int[] first_array=new int[array_length];
        int[] second_array=new int[array_length];
      //  sc.nextLine();
        for (int i = 0; i <first_array.length ; i++) {
            first_array[i]=sc.nextInt();
        }

        for (int i = 0; i <second_array.length ; i++) {
            second_array[i]=sc.nextInt();
        }

        int[] output_array=new int[array_length];
        for (int i = 0; i <output_array.length ; i++) {
            output_array[i]=first_array[i]+second_array[i];
        }


        for (int i = 0; i < output_array.length; i++) {
            System.out.print(output_array[i] + (i != output_array.length - 1 ? " " : ""));
        }

        sc.close();
    }
}
