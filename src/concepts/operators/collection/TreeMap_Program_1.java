package concepts.operators.collection;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * Created by ritmukherjee on 1/25/2017.
 */
public class TreeMap_Program_1 {
    public static void main(String[] args) {



     /*   inner class approach*/
        TreeMap<String,Integer> treeMap_1=new TreeMap<>(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return o2.toString().compareTo(o1.toString());
            }
        });
        treeMap_1.put("EEE",555);
        treeMap_1.put("AAA",111);
        treeMap_1.put("DDD",444);
        treeMap_1.put("BBB",222);
        treeMap_1.put("CCC",333);
        System.out.println(treeMap_1);


        /*Lambda Expression Approach*/
        TreeMap<String,Integer> treeMap_2=new TreeMap<>((o1, o2) -> - o2.toString().compareTo(o1.toString()));
        treeMap_2.put("EEE",555);
        treeMap_2.put("AAA",111);
        treeMap_2.put("DDD",444);
        treeMap_2.put("BBB",222);
        treeMap_2.put("CCC",333);
        System.out.println(treeMap_1);
    }

}
