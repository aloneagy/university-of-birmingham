package day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("d");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.charAt(0)-o1.charAt(0);
            }
        });
        System.out.println(list);
    }

}
