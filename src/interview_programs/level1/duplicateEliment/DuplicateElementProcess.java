package interview_programs.level1.duplicateEliment;

/**
 * Created by PouRit on 29-10-2017.
 */
public class DuplicateElementProcess {

    public static int[] removeDuplicateFromSortedArray(int[] input){

            int j = 0;
            int i = 1;
            if(input.length < 2) {
                return input;
            } else {
                while(i < input.length) {
                    if(input[i] == input[j]) {
                        ++i;
                    } else {
                        ++j;
                        input[j] = input[i++];
                    }
                }

                int[] output = new int[j + 1];

                for(int k = 0; k < output.length; ++k) {
                    output[k] = input[k];
                }

                return output;
            }

    }

    public static void main(String[] args) {

        int[] input = new int[]{2, 3, 3, 6, 8, 9, 10, 10, 10, 12, 12};
        int[] output=removeDuplicateFromSortedArray(input);
        for (int i: output){
            System.out.print(i+",");
        }
    }
}
