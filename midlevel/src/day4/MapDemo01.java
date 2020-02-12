package day4;

import java.util.HashMap;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();

        map.put("a","aa");
        map.put("b","bb");
        map.put("c","cc");
        Set<String> keys=map.keySet();
        for(String key:keys){
            String value=map.get(key);
            System.out.println(key+value);
        }
    }
}
