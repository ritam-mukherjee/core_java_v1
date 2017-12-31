package interview_programs.level1.array_programs.missing_elements;

import java.util.function.BiFunction;

interface iFindMissingSingleElement {
    public void printMissingElement(int[] arr,int size);
}
public class FindMissingSingleElement {
    public static void main(String[] args) {
        iFindMissingSingleElement iFindMissingSingleElement =(arr, size) -> {
            int expected_total=(size*(size+1))/2;
            int actual_total=0;

            for (int i = 0; i <arr.length ; i++) {
                actual_total=actual_total+arr[i];
            }

            System.out.println(expected_total-actual_total);
        };


        int[] arr={1,2,3,4,6};
        iFindMissingSingleElement.printMissingElement(arr,arr.length+1);

    }
}
