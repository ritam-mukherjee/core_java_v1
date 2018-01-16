package interview_programs.hacker_rank.java_probs.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

/**
 * Source       :   Hacker Rank
 * Link         :   https://www.hackerrank.com/challenges/java-string-compare/problem
 */

public class Java_Output_Formatting {
    public static void main(String[] args) {
        /*Functional Declarations*/
        BiPredicate<Integer,Integer> isSmall=(integer1, integer2) -> integer1<integer2;
        BiPredicate<Integer,Integer> isBig=(integer1, integer2) -> integer1>integer2;
        BiFunction<String,String ,String> doPadding=(str1, str2) -> {
        Supplier<Integer> int_init_location=() -> 15;
        StringBuffer sb=new StringBuffer();

         String_Padding:
            for (int i = 0; i < int_init_location.get(); i++) {
                if(i<int_init_location.get()){
                    if(isSmall.test(i,str1.length()))
                        sb.append(str1.charAt(i));
                    else
                        sb.append(" ");
                }
            }
            Integer_Padding:
            for(int j=3;j>0;j--){
                if(isBig.test(j,str2.length()))
                    sb.append("0");
                else
                    sb.append(str2.charAt(str2.length()-j));
            }
            return sb.toString();
        };

        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();

            System.out.println(doPadding.apply(s1,String.valueOf(x)));
            //Complete this line
        }
        System.out.println("================================");

    }
}
