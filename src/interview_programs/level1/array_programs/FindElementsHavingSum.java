package interview_programs.level1.array_programs;

import java.util.function.BiConsumer;

/**
 * The  program will take an array and check whether sum of two elements equal to a given number or not
 */
public class FindElementsHavingSum {
    public static void main(String[] args) {

        BiConsumer<Integer,Integer> printNumber=(i1,i2)->{
           System.out.println("Elements are :   ["+i1+","+i2+"]");
        };
        BiConsumer<int[],Integer> findElements=(arr,sum)->{

            outerLoop:
            for (int i = 0; i < arr.length; i++) {
                innerLoop:
                for (int j = i+1; j <arr.length ; j++) {
                    checkSum:
                    if(arr[i]+arr[j]==sum){
                        printNumber.accept(arr[i],arr[j]);
                    }
                }
            }
        };

        int[] the_array={9,2,6,1,7,5,8,0,3,4};
        int the_sum=8;
        findElements.accept(the_array,the_sum);
    }

}
