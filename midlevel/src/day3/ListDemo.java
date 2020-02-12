package day3;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String>list =new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        list.add(1,"t");
        System.out.println(list);
        System.out.println(list.remove(2));

        list.set(0,"p");
        System.out.println(list);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        for(String s:list){
            System.out.println(s);
        }
    }

}
