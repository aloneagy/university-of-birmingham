package day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<String>();
        coll.add("a");
        coll.add("b");
        coll.add("c");

        Iterator<String> it=coll.iterator();
        while (it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }
        System.out.println(coll);
    }
}
