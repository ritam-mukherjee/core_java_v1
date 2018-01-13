package interview_programs.hacker_rank.java_probs.object_oriented_Programming;
/**
 *  Source  :   HackerRank
 *  Link    :   https://www.hackerrank.com/challenges/java-method-overriding/problem
 */

import java.util.Scanner;

interface AdvancedArithmetic{
int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{


    @Override
    public int divisor_sum(int n) {
        int count=1;
        int sum=n;//sum must be include n at least once
        traverse_till_half:
        while (count<=n/2){
            is_devisable:
            if(n%count==0)
                sum+=count;

            count++;
        }
        return sum;
    }
}
public class Java_Interface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(new MyCalculator().divisor_sum(input));
    }
}
