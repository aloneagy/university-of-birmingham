package day13;

import java.util.function.Function;

public class Demo11FunctionApply {
    private static void method(Function<String,Integer> function){
        int num=function.apply("10");
        System.out.println(num+20);
    }

    public static void main(String[] args) {
        method(s -> Integer.parseInt(s));
    }
}
