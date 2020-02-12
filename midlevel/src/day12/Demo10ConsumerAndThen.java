package day12;

import java.util.function.Consumer;

public class Demo10ConsumerAndThen {
    private static void consumString(Consumer<String> one,Consumer<String>two){
        one.andThen(two).accept("Hello");
    }

    public static void main(String[] args) {
        consumString(s-> System.out.println(s.toUpperCase()),s-> System.out.println(s.toLowerCase()));
    }
}
