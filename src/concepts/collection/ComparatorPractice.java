package concepts.collection;


import java.util.Arrays;

public class ComparatorPractice {
    public static void main(String[] args) {
        String[] names=new String[]{
                "ram" ,"ran","san","rama"
        };

        Arrays.sort(names,(o1, o2) -> o1.compareTo(o2));

        for (String name :
                names) {
            System.out.println(name);
        }
    }



}
