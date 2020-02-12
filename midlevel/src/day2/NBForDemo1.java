package day2;

import java.util.ArrayList;
import java.util.Collection;

public class NBForDemo1 {
    public static void main(String[] args) {
        int[] arr={3,5,6,87};
        for (int a:arr) {
            System.out.println(a);
        }
        Collection<String> coll=new ArrayList<String>();
        coll.add("a");
        coll.add("b");
        coll.add("c");
        for (String s:coll) {
            System.out.println(s);

        }
    }

}
