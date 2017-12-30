package interview_programs.level1.number_programs.palindrome_number;

import java.util.Scanner;

/**
 * Created by ritmukherjee on 11/27/2016.
 * palindromic number
 * -----------------
 * A palindromic number or numeral palindrome is a number that remains the same when its digits are reversed.
 * Like 16461, for example, it is "symmetrical". The term palindromic is derived from palindrome,
 * which refers to a word (such as rotor or racecar) whose spelling is unchanged when its letters are reversed.
 */
public class PalindromeNumber {
    public boolean checkPalindrome(int number){
        int remainder=0,sum=0,temp=number;

        while(number>0){
            remainder=(number%10);
            sum=sum*10+remainder;
            number=number/10;

        }
        if(sum==temp){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of no:");
        int number=sc.nextInt();
        System.out.println("Is Palindrome?  "+new PalindromeNumber().checkPalindrome(number));
    }
}
