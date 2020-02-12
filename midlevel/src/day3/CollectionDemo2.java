package day3;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("c");
        list.add("b");
        list.add("a");
        list.add("d");
        Collections.sort(list);
        System.out.println(list);
    }

}
