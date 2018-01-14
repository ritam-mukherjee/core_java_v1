package exam.ubs;

/**
 *
 * That is perfection

 Write a program to determine whether a number N

 is equal to the sum of its proper positive divisors (excluding the number itself).

 Input format

 First line: T

 (number of test cases)
 For each test case
 First line: N

 Output format

 Print YES, if N

 is equal to the sum of its proper positive divisors else print NO.

 Constraints

 1≤T≤100

 1≤N≤109

 Sample Input

 3
 6
 5
 28

 Sample Output

 YES
 NO
 YES


 * */


import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class That_is_perfection {

    public static void main(String[] args) {
        Consumer<String> console_printer=System.out::println;

        Scanner scanner=new Scanner(System.in);

        Function<Integer,Integer> checkPerfect= integer -> {
            int sum=integer;
            int i=1;

            find_All_divisable:
            while(i<=(integer/2)){

                find_perfect_divisable:
                if(integer%i==0)
                    sum-=i;
                i++;
            } /*end of while*/
            return sum;
        };

        Predicate<Integer> isZero=integer -> integer==0;


        int test_cases= scanner.nextInt();
        ArrayList<Integer> all_inputs=new ArrayList<>(test_cases);
        dynamic_testcase_inputs:
        while(test_cases>0){

            all_inputs.add(scanner.nextInt());

            test_cases--;
        }


        all_inputs.stream().forEach(integer -> console_printer.accept(isZero.test(checkPerfect.apply(integer))?"YES":"NO"));

    }
}
