package day4;

import java.util.Map;
import java.util.Set;

public class HashMap {
    public static void main(String[] args) {
        Map<Student,String>map=new java.util.HashMap<>();
        map.put(new Student("a",1),"aa");
        map.put(new Student("b",2),"bb");
        map.put(new Student("c",3),"cc");
        map.put(new Student("d",4),"dd");
        map.put(new Student("e",5),"ee");
        Set<Student>keySet=map.keySet();
        for(Student a:keySet){
            String value=map.get(a);
            System.out.println(a.toString()+value);
        }

    }

}
