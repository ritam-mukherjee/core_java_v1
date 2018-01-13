package concepts.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ritmukherjee on 4/14/2016.
 */
public class HashMap_Program_1 {
    public static void main(String[] args) {

        Map m1=new HashMap<>();
        Collections.synchronizedMap(m1);

        Object o1=m1.put(1,"one");
        System.out.println("The value without entry"+o1);

        Object object1=m1.put(1,"two");

        HashMap hashMap = new HashMap();


    }
}
