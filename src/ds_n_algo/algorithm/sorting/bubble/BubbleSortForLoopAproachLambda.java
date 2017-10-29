package ds_n_algo.algorithm.sorting.bubble;

import java.util.function.Consumer;

/**
 * Created by PouRit on 29-10-2017.
 */
interface iBubbleSort{
    public  int[] doSorting(int[] arr);
}

public class BubbleSortForLoopAproachLambda {
    public static void main(String[] args) {
        iBubbleSort bubbleSort=arr -> {
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
        };

        Consumer<int[]> arrayConsumer=ints ->  {
            for (int i: ints){
                System.out.print(i+",");
            }
        };
        int[] inPut={5,8,2,6,9,7,4,0,1,2,3};
        arrayConsumer.accept(bubbleSort.doSorting(inPut));
    }



}
