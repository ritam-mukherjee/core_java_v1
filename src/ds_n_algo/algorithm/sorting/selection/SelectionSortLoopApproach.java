package ds_n_algo.algorithm.sorting.selection;

/**
 * Created by PouRit on 30-10-2017.
 */
public class SelectionSortLoopApproach {

    public static int[] doSelectionSorting(int[] arr) {

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
    }

    public static void main(String[] args) {
        int[] inPut = {5, 8, 2, 6, 9, 7, 4, 0, 1, 2, 3};
        int[] outPut = doSelectionSorting(inPut);
        for (int i : outPut) {
            System.out.print(i + ",");
        }

    }

}
