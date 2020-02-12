package hanshujiekou;

import java.util.function.Function;

public class Test7 {
    public static void main(String[] args) {
        String str="赵丽颖,20";
        dealString(str,s -> s.split(",")[1],
        Integer::parseInt,age->age+10);

    }
    public static void dealString(String str, Function<String,String>one,Function<String,Integer>two,Function<Integer,Integer>three){
        Integer result=one.andThen(two).andThen(three).apply(str);
        System.out.println("result = " + result);
    }
}
