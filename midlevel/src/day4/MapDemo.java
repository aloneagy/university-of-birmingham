package day4;

import java.util.HashMap;

public class MapDemo {

    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<String, String>();
        map.put("a","aa");
        map.put("b","bb");
        map.put("c","cc");
        System.out.println(map);
        System.out.println(map.remove("a"));
        System.out.println(map);

        System.out.println(map.get("c"));
        System.out.println(map.get("b"));
    }

}
