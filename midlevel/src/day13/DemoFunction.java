package day13;

import java.util.function.Function;

public class DemoFunction {
    public static void main(String[] args) {
        String str="赵丽颖,20";

        System.out.println(num(str,s->Integer.parseInt(s.split(",")[1]),s->s+100));
    }
    private static int num(String s,Function<String,Integer>one,Function<Integer,Integer>two){
        int number=one.andThen(two).apply(s);
        return number;
    }

}
