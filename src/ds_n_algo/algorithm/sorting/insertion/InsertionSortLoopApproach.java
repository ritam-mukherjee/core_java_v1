package ds_n_algo.algorithm.sorting.insertion;

/**
 * Created by PouRit on 30-10-2017.
 */
public class InsertionSortLoopApproach {

    public static int[] doInsertionSorting(int[] arr) {

        OuterLoop:/*It maintains regular element (n) traversal of array*/
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
    }

    public static void main(String[] args) {
        int[] inPut = {5, 8, 2, 6, 9, 7, 4, 0, 1, 2, 3};
        int[] outPut = doInsertionSorting(inPut);
        for (int i : outPut) {
            System.out.print(i + ",");
        }

    }

}
