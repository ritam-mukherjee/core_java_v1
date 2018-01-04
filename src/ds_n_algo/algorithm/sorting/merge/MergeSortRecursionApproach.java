package ds_n_algo.algorithm.sorting.merge;

import java.util.Arrays;
import java.util.function.Consumer;

public class MergeSortRecursionApproach {


    public static void mergeSort(int[] arr) {

        mergeSort(arr, new int[arr.length], 0, arr.length - 1);

    }

    public static void mergeSort(int arr[], int[] temp, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }

        /*  int mid=leftStart+((rightEnd-leftStart)/2);*/
        int mid = (leftStart + rightEnd) / 2;
        mergeSort(arr, temp, leftStart, mid);
        mergeSort(arr, temp, mid + 1, rightEnd);
        mergeHalves(arr, temp, leftStart, rightEnd);
    }

    public static void mergeHalves(int[] arr, int[] temp, int leftStart, int rightEnd) {
        /*find our span of left part*/
        /*int leftEnd=leftStart+((rightEnd-leftStart)/2);*/
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;

        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        simultanious_left_right_traversal:
        while (left <= leftEnd && right <= rightEnd) {
            if (arr[left] <= arr[right]) {
                temp[index] = arr[left];
                left++;
            } else {

                temp[index] = arr[right];
                right++;
            }
            index++;
        }

        only_left_trversal:
        while (left <= leftEnd) {
            temp[index] = arr[left];
            left++;
            index++;
        }

        only_right_trversal:
        while (right <= rightEnd) {
            temp[index] = arr[right];
            right++;
            index++;
        }

 /*       System.arraycopy(arr,left,temp,index,leftEnd-left+1);
        System.arraycopy(arr,right,temp,index,rightEnd-right+1);*/

        System.arraycopy(temp, leftStart, arr, leftStart, size);


    }

    public static void main(String[] args) {
        Consumer<int[]> arrayConsumer = ints -> Arrays.stream(ints).forEach(value -> System.out.print(value + ","));
        int[] arr = {2, 8, 5, 6, 9, 7, 1, 4};
        arrayConsumer.accept(arr);

        System.out.println("-------------------sorting------------------");
        mergeSort(arr);
        arrayConsumer.accept(arr);


    }
}
