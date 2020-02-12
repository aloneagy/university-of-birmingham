package day2;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1Collection {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();

        coll.add("a");
        coll.add("b");
        coll.add("c");
        System.out.println(coll);

        System.out.println("判断是否有A"+coll.contains("a"));
        System.out.println("删除b"+coll.remove("b"));
        System.out.println(coll);

        System.out.println("几个元素："+coll.size());

        Object[] objects=coll.toArray();

        for (int i = 0; i <objects.length ; i++) {
            System.out.println(objects[i]);

        }
        coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty());
    }
}
