package day12;

import java.util.function.Consumer;

public class Demo09Consumer {
    private static void conSumerString(Consumer<String> function){
        function.accept("hello");
    }

    public static void main(String[] args) {
        conSumerString(s-> System.out.println(s));
        conSumerString(System.out::println);
    }
}
