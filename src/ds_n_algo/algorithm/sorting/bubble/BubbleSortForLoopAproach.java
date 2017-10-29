package ds_n_algo.algorithm.sorting.bubble;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by PouRit on 29-10-2017.
 */
public class BubbleSortForLoopAproach {
    public static int[] doSorting(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] inPut={5,8,2,6,9,7,4,0,1,2,3};
        int[] outPut=doSorting(inPut);
        for (int i: outPut){
            System.out.print(i+",");
        }

    }

}
