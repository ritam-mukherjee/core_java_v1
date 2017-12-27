package interview_programs.level1.reverse;

import java.util.Scanner;

/**
 * Created by ritmukherjee on 11/2/2016.
 */
public class ReverseString {

    public static void main(String[] args) {
        System.out.println("Enter a String  :   ");
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println("String reverse by loop  :   "+new ReverseString().reverseStringByLoop(input));

        System.out.println("String reverse by StringBuffer  :   " + new ReverseString().reverseStringByStringBuffer(input));
    }

    public String reverseStringByLoop(String input){
        StringBuffer output=new StringBuffer();
        for (int i = input.length()-1; i >=0; i--) {
            output.append(input.charAt(i));
        }
        return output.toString();
    }


    public String reverseStringByStringBuffer(String input){
        StringBuffer output=new StringBuffer(input).reverse();

        return output.toString();
    }


}
