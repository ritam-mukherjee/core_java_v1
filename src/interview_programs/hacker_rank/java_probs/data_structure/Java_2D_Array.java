package interview_programs.hacker_rank.java_probs.data_structure;

import java.util.function.Consumer;
import java.util.function.Function;

public class Java_2D_Array {
    public static void main(String[] args) {
        Integer[][] arr=new Integer[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };


        Integer[][] array2=new Integer[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 9, 2, -4, -4, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, -1, -2, -4, 0},
        };
        Consumer<Integer> printConsumer=System.out::println;
        Function<Integer[][],Integer> getBigSum=array -> {
            int max_sum=Integer.MIN_VALUE;
            for (int i = 0; i < (array.length - 2); i++) {
                for (int j = 0; j < (array[i].length - 2); j++) {
                    /*Hour glass sum calculation*/
                    int sum =   (array[i][j]    + array[i][j + 1] + array[i][j + 2])
                                                + array[i + 1][j + 1] +
                                (array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2]);

                    if (sum>max_sum)
                        max_sum=sum;
                }
            }
            return max_sum;
        };

        printConsumer.accept(getBigSum.apply(array2));
    }
}
