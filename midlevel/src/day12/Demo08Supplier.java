package day12;

import java.util.function.Supplier;

public class Demo08Supplier {
    private static String getString(Supplier<String> function){
        return function.get();
    }

    public static void main(String[] args) {
        String msgA="hello";
        String msgb="world";
        System.out.println(getString(()->msgA+msgb));
    }
}
