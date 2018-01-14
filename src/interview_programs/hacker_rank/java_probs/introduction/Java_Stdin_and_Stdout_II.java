package interview_programs.hacker_rank.java_probs.introduction;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-stdin-stdout/problem
 */
public class Java_Stdin_and_Stdout_II {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        double d = scan.nextDouble();

        String s = scan.next();
        s+=scan.nextLine();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
