package day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {

    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();
        map.put("a","aa");
        map.put("b","bb");
        map.put("c","cc");
        Set<Map.Entry<String,String>> entrySet=map.entrySet();
        for(Map.Entry<String,String> entry:entrySet){
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+value);
        }
    }
}
