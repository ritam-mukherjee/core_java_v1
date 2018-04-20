package coding_challenges.hacker_rank.java_probs.data_structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;


public class Java_List {
    public static void main(String[] args) {
        Consumer<ArrayList<Integer>> print=integers -> integers.stream().forEach(integer -> System.out.print(integer+" "));
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        ArrayList<Integer> al=new ArrayList<Integer>();
        sc.nextLine();
        String elements=sc.nextLine();

        String[] elementArray=elements.split(" ");

        Arrays.stream(elementArray).forEach(s -> al.add(Integer.parseInt(s)));

        int query=sc.nextInt();

        operation_generator:
        while(query>0){

            String operation=sc.next();
            sc.nextLine();
            input_insert:
            if(operation.equalsIgnoreCase("Insert")) {

                String insert_items = sc.nextLine();
                String[] insert_array = insert_items.split(" ");
                BiPredicate<Integer, Integer> check_input_length = (integer1, integer2) -> integer1 == integer2;

                if (check_input_length.test(insert_array.length,2)) {
                    int index = Integer.parseInt(insert_array[0]);
                    int item = Integer.parseInt(insert_array[1]);

                    BiPredicate<Integer, Integer> checkSize = (integer1, integer2) -> integer1 <= integer2;

                    capacity_check:
                    if (!checkSize.test(index, size)) {
                        do {
                            al.add(0);
                            size++;
                        }
                        while (size < index);
                    }

                    al.add(index, item);
                }//end of insert
            }
            input_delete:
            if(operation.equalsIgnoreCase("delete")){

                int delete_index=sc.nextInt();
                al.remove(delete_index);
            }

            query--;
        }

       print.accept(al);
    }
}
