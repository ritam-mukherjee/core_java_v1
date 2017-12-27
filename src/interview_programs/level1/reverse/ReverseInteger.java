package interview_programs.level1.reverse;

/**
 * Created by ritmukherjee on 10/23/2016.
 */
import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Integer value  :");
        int input=scanner.nextInt();
        int reverse=0;

        while(input!=0){
            reverse=reverse*10;
            reverse=reverse+(input%10);
            input=input/10;
        }
        System.out.println("Reverse Integer is  :   "+reverse);
    }
}
