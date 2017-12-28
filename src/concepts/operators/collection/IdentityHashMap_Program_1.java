package concepts.operators.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;

/**
 * Created by ritmukherjee on 4/20/2016.
 */
public class IdentityHashMap_Program_1 {
    public static void main(String[] args) {

        Integer i1=new Integer(10);
        Integer i2=new Integer(10);

        HashMap hm=new HashMap();
        hm.put(i1,"ABC");
        hm.put(i2, "XYZ");

        System.out.println("hash map is:" + hm);

        IdentityHashMap ihm=new IdentityHashMap();
        ihm.put(i1,"ABC");
        ihm.put(i2,"XYZ");

        System.out.println("Identity hash map is:"+ihm);


    }
}
