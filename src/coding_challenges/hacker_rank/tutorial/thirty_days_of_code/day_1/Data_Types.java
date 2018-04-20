package coding_challenges.hacker_rank.tutorial.thirty_days_of_code.day_1;

import java.util.Scanner;
import java.util.function.Consumer;

public class Data_Types {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";
        Scanner scan = new Scanner(System.in);

        Consumer<Object> print_consumer = System.out::println;

        /* Declare second integer, double, and String variables. */
        int _i;
        double _d;
        String _s;
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        _i = scan.nextInt();
        _d = scan.nextDouble();
        _s = scan.next();
        _s += scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println((Integer) _i + i);

        /* Print the sum of the double variables on a new line. */
        System.out.println((Double) _d + d);

        /* Concatenate and print the String variables on a new line;
            the 's' variable above should be printed first. */
        System.out.println(s.concat(" ").concat(_s));

        scan.close();
    }
}
