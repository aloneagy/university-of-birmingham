package day13;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo15StreamCollect {
    public static void main(String[] args) {
        Stream<String> stream=Stream.of("10","20","30","40","50");
        List<String> list=stream.collect(Collectors.toList());
    //    Set<String> set=stream.collect(Collectors.toSet());
        for(String s:list){
            System.out.println(s);
        }
    }
}
