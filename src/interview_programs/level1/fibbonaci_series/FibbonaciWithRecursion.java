package interview_programs.level1.fibbonaci_series;

import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * Created by PouRit on 18-11-2017.
 */

interface iFibbonaci{
    public int doPrintFibbonaci(int count,int num1,int num2);
}
public class FibbonaciWithRecursion {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;

        int term=5;
        BiFunction<Integer,Integer,Integer> sum=(integer1, integer2) -> (integer1+integer2);

        Consumer print=s -> System.out.println(s+",");

        iFibbonaci fibbonaci=(count, num11, num21) -> {
            print.accept(sum.apply(num11,num21));
            return count--;
        };

    /*    iFibbonaci fibbonaci=count,/ -> {

                sum.apply(num1,num2);
                System.out.println((sum.apply(num1,num2)));

               return count--;


        };*/

        while(term>0){
            term = fibbonaci.doPrintFibbonaci(term, num1, num2);
            num1++;
            num2++;

        }
    }

}
