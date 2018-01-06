package interview_programs.level1.array_programs.FindSecondLargentElement;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class FindSecondLargestElement {
    public static void main(String[] args) {

        BiConsumer<Integer,Integer> print_consumer=(first, second) -> {
            System.out.println("Largest :"+first+",\tSecond:"+second);
        };


        Consumer<Integer[]> large_two_numbers=integers -> {

            int largest=0;
            int second_largest=0;

            for (Integer i :integers
                    ) {
                if(i>largest) {
                    second_largest = largest;  /*assignment ordering is important*/
                    largest = i;
                }
            }

            print_consumer.accept(largest,second_largest);
        };

        Integer[] arr={2,3,7,8,5,4,1,0};
        large_two_numbers.accept(arr);
    }

}
