package interview_programs.level1.array_programs;

import java.util.Arrays;
import java.util.function.Consumer;

public class RemoveDuplicate {
    public static int[] removeDuplicates(int[] arr) {

        int end = arr.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i] == arr[j]) {
                    int shiftLeft = j;
                    for (int k = j+1; k < end; k++, shiftLeft++) {
                        arr[shiftLeft] = arr[k];
                    }
                    end--;
                    j--;
                }
            }
        }

        int[] whitelist = new int[end];
        for(int i = 0; i < end; i++){
            whitelist[i] = arr[i];
        }
        return whitelist;
    }

    public static void main(String[] args) {
        int arr[]={1,6,6,9,9,0,8,8,8,2,5,7,5,7};
        int out[]=removeDuplicates(arr);

        Consumer<int[]> arrayConsumer= ints -> Arrays.stream(ints).forEach(value -> System.out.print(value+","));
        arrayConsumer.accept(out);
    }
}
