package day3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Collections.addAll(list,5,222,1,2);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
