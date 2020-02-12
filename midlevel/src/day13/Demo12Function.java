package day13;

import java.util.function.Function;

public class Demo12Function {
    private static void method(Function<String,Integer>one,Function<Integer,Integer>two){
        int num=one.andThen(two).apply("10");
        System.out.println(num);
    }

    public static void main(String[] args) {
        method(Integer::parseInt,i->i*=10);
    }
}
