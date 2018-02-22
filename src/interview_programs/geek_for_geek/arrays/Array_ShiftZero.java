package interview_programs.geek_for_geek.arrays;

    /**
     * Source   :   geekForGeek
     * Url      :   https://www.geeksforgeeks.org/move-zeroes-end-array/
     * Given an array of random numbers, Push all the zero’s of a given array to the end of the array.
     * For example
     *  Input   :    {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, Output  :   {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}.
     * The order of all other elements should be same. Expected time complexity is O(n) and extra space is O(1).
     *
     */

import java.util.function.Consumer;
import java.util.function.Function;

public class Array_ShiftZero {
    public static void main(String[] args) {
        int input[] = new int[]{ 0, -1, 0, 1, 5, -3 };


        Function<int[],int[]> shift_zero_right=arr->{
            int n=arr.length-1;
            int right=n;

            for(int i=n;i>=0;i--)
            {
                if(arr[i]==0)
                {
                    int temp=arr[i];
                    arr[i]=arr[right];
                    arr[right]=temp;
                    right--;
                }
            }
            return arr;
        };

        Function<int[],int[]> shift_zero_left=arr->{
            int n=0;
            int left=0;

            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==0)
                {
                    int temp=arr[i];
                    arr[i]=arr[left];
                    arr[left]=temp;
                    left++;
                }
            }
            return arr;
        };


        Consumer<int[]> array_printer=result->{
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("\n------------------------");
        };

        array_printer.accept(shift_zero_left.apply(input));
        array_printer.accept(shift_zero_right.apply(input));


    }


}
