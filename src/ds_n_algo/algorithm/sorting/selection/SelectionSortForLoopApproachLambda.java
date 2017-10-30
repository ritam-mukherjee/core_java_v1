package ds_n_algo.algorithm.sorting.selection;

import java.util.function.Consumer;

/**
 * Created by PouRit on 30-10-2017.
 */

interface iSelectionSort{
    public  int[] doSelectionSorting(int[] arr);
}
public class SelectionSortForLoopApproachLambda {
    public static void main(String[] args) {
        iSelectionSort selectionSort = arr -> {

            for (int i = 1; i <= arr.length; i++) {

                for (int j = i - 1; j > 0; j--) {
                    if (arr[j] < arr[j - 1]) {
                        int temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
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
        selectionSort.doSelectionSorting(inPut);
    }

}
