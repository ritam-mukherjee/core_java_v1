package interview_programs.level1.number_programs.number_digit_sum;

import java.util.function.*;

/**
 * @Program : The Program try to find sum of all digits of a given no.
 */


public class NumberDigitSumLambdaApproach {
   static int calculateSum=0;
   /* Approach 1    :The method is responsible to add all digits by recursive approach*/
    static public  int getSumWithRecursion(int num){

        if(num==0){
            return calculateSum;
        }
        else{
            int remainder=num%10;
            calculateSum=calculateSum+remainder;
            num=num/10;
            getSumWithRecursion(num);
        }
        return calculateSum;
    }


        public static void main(String[] args) {

            Consumer<String> print_consumer=System.out::println;
            BiFunction<Integer,Integer,String> result_generator = (number,sum_value) -> {
                return "The Sum of "+number+" is "+sum_value+".";
            };

            /*Approach2: The method add all digits by While loop approach*/
            Function<Integer, Integer> digitLoopSum = num -> {
                int sum = 0;

                while (num != 0) {
                    int remainder = num % 10;
                    sum = remainder + sum;
                    num = num / 10;
                }
                return sum;
            };

            Function<Integer, Integer> f1s = num -> {
                int sum = 0;

                int remainder = num % 10;
                sum = sum + remainder;
                return sum;

            };

            print_consumer.accept(result_generator.apply(123,digitLoopSum.apply(123)));

            Function<Integer,Integer> recursionSum= NumberDigitSumLambdaApproach::getSumWithRecursion;
            print_consumer.accept(result_generator.apply(134,recursionSum.apply(134)));

    }
}
