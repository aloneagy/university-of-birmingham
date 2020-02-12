package day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo {
    public static void main(String[] args) {
        Collection coll=new ArrayList();
        coll.add("a");
        coll.add("b");
        coll.add(5);
        Iterator it=coll.iterator();
        while (it.hasNext()){
            String s=(String)it.next();
            System.out.println(s.length());
        }
    }

}
