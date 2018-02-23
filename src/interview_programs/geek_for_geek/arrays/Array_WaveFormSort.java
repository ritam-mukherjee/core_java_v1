package interview_programs.geek_for_geek.arrays;

/**
 * Source   : Geek For Geek
 * Link     :   https://www.geeksforgeeks.org/sort-array-wave-form-2/
 */

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 *
 Sort an array in wave form
 Given an unsorted array of integers, sort the array into a wave like array.
 An array ‘arr[0..n-1]’ is sorted in wave form if arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..
 */
public class Array_WaveFormSort<T extends Number> {

    public static void main(String[] args) {
       Function<int[],int[]> arraySort=arr -> {

            Arrays.sort(arr);

            for (int i = 0; i < arr.length-1; i+=2) {
               int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            return arr;
        };


        Consumer<int[]> array_printer= result->{
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
        };

        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        array_printer.accept(arraySort.apply(arr));
    }


}
