package interview_programs.level1.reverse;

import com.sun.deploy.util.StringUtils;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by ritmukherjee on 12/11/2016.
 */
public class ReverseStringWords {

    public static void doReverve(String str){

        String[] strArray= StringUtils.splitString(str," ");
        Stack stack=new Stack();
        for(String s:strArray){
            stack.push(s);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a String  :   ");
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();

        doReverve(input);
    }
}
