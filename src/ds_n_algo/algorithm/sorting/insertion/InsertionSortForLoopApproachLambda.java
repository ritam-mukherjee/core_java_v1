package ds_n_algo.algorithm.sorting.insertion;

import java.util.function.Consumer;

/**
 * Created by PouRit on 30-10-2017.
 */

interface iInsertionSort {
    public int[] doInsertionSorting(int[] arr);
}

public class InsertionSortForLoopApproachLambda {
    public static void main(String[] args) {
        iInsertionSort insertionSort = arr -> {

            OutterLoop:/*It maintains regular element (n) traversal of array*/
            for (int i = 1; i <= arr.length; i++) {

                InnerLoop:/*its maintain backward traversal*/
                for (int j = i - 1; j > 0; j--) {

                    SwapMenimum:/*chose two elements and swap lower one to left side*/
                    if (arr[j] < arr[j - 1]) {
                        int temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            return arr;
        };

        Consumer<int[]> arrayConsumer = ints -> {
            for (int i : ints) {
                System.out.print(i + ",");
            }
        };
        int[] inPut = {5, 8, 2, 6, 9, 7, 4, 0, 1, 2, 3};
        insertionSort.doInsertionSorting(inPut);
    }

}
