package concepts.collection;

import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * Created by ritmukherjee on 4/20/2016.
 */

class Temp{
    @Override
    public String toString() {
        return "Temp{}";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize methof of Temp Calss called ");
        super.finalize();
    }
}

public class WeakHashMap_Program_1 {
    public static void main(String[] args) throws InterruptedException {
        Temp temp=new Temp();
        HashMap hm=new HashMap();
        hm.put(temp,"ABC");
        System.out.println("HashMap before GC" + hm);
        temp=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println("HashMap after GC" + hm);

        System.out.println("-----------------------------");
        Temp temp2=new Temp();
        WeakHashMap whm= new WeakHashMap();
        whm.put(temp2,"ABC");
        System.out.println("WeakHashMap before GC" + whm);
        temp2=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println("WeakHashMap after GC" + whm);
    }

}
