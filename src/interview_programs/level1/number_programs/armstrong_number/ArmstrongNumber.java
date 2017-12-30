package interview_programs.level1.number_programs.armstrong_number;

import java.util.Scanner;

/**
 * Created by ritmukherjee on 12/2/2016.
 * An Armstrong number of three digits is an integer such that the sum of the cubes of its digits
 * is equal to the number itself. For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
 */
public class ArmstrongNumber {
    public boolean checkArmstrong(int number){
        int input =number,sum=0,temp=0;
        while(input!=0){
            int remainder=input%10;
            temp=temp+(remainder*remainder*remainder);
            input=input/10;
        }
        if(temp==number){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int input=sc.nextInt();

        System.out.println("Is Armstrong? "+new ArmstrongNumber().checkArmstrong(input));
    }


}
