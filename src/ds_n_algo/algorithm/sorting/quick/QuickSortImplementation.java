package ds_n_algo.algorithm.sorting.quick;

import java.util.Arrays;
import java.util.function.Consumer;

public class QuickSortImplementation {
    public static  void quickSort(int[] arr){
    quickSort(arr,0,arr.length-1);
    }

    public static  void quickSort(int[] arr, int left, int right){
        if(left>=right)
            return;

        int pivot=arr[(left+right)/2];

        int index=partition(arr,left,right,pivot);

        quickSort(arr,left,index-1);
        quickSort(arr,index,right);
    }

    public static int partition(int[] array,int left, int right,int pivot){

             while (left<=right)   {

                 left_to_pivot_traversal: //left->right
                 while(array[left]<pivot) {
                     left++;
                 }

                 right_to_pivot_traversal:  //right->left move
                 while(array[right]>pivot) {
                     right--;
                 }
                 left_right_swap:
                 if(left<=right){
                     int temp=array[left];
                     array[left]=array[right];
                     array[right]=temp;
                     left++;
                     right--;

                 }

             }

        return left; //left element as partion
    }

    public static void main(String[] args) {
        Consumer<int[]> arrayConsumer=ints -> Arrays.stream(ints).forEach(value -> System.out.print(value+","));

        int[] arr={4,2,3,5,9,7,1,8};
        arrayConsumer.accept(arr);
        System.out.println("\n sorting");

        quickSort(arr);
        arrayConsumer.accept(arr);


    }
}
