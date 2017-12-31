package interview_programs.level1.array_programs.missing_elements;

import java.util.Arrays;

interface iFindMissingElement {
    public void printMisingElement(int[] arr);
}
public class FindMissingElements {

    public static void main(String[] args) {
        iFindMissingElement iFindMissingElement = arr -> {

            Arrays.sort(arr);

            for (int i = 1; i <arr.length ; i++) {
                if(arr[i]-arr[i-1]>1){
                    int num=arr[i-1]+1;
                    while(num<(arr[i])){
                        System.out.println(num);
                        num++;
                    }
                }
            }

        };
        int[] array={9,2,5,6,1};
        iFindMissingElement.printMisingElement(array);
    }
}
