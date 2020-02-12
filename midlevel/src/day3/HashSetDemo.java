package day3;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<String>();
        set.add(new String("a"));
        set.add("b");
        set.add("c");
        set.add("a");
        set.add("a");
        for (String s:set){
            System.out.println(s);
        }
    }

}
