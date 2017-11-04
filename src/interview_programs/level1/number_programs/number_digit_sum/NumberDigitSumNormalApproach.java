package interview_programs.level1.number_programs.number_digit_sum;

import java.util.Scanner;

/**
 * Created by PouRit on 04-11-2017.
 */
public class NumberDigitSumNormalApproach {
    static int sum_with_recursion=0;
    static int sum_without_recursion=0;
    public static int getSumWithoutRecursion(int num){


        while(num!=0){
            int remainder=num%10;
            sum_without_recursion=sum_without_recursion+remainder;
            num=num/10;
         /*  getSum(num);*/
        }
        return sum_without_recursion;
    }


    public static int getSumWithRecursion(int num){

        if(num==0){
            return sum_with_recursion;
        }
        else{
            int remainder=num%10;
            sum_with_recursion=sum_with_recursion+remainder;
            num=num/10;
            getSumWithRecursion(num);
        }
        return sum_with_recursion;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Integer value  :");
        int input=scanner.nextInt();
        System.out.println("sum of "+input+" with Recursion is "+getSumWithRecursion(input));
        System.out.println("sum of "+input+" without Recursion is "+getSumWithoutRecursion(input));
    }
}
