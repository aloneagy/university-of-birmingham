package hanshujiekou;

import java.util.function.Function;

public class Test6 {
    public static void main(String[] args) {
        stringToInteger("100", l -> Integer.parseInt(l), num -> num + 100);
        stringToInteger("998", Integer::parseInt, num -> num + 2);

    }

    public static void stringToInteger(String str, Function<String, Integer> one, Function<Integer, Integer> two) {
        int result = one.andThen(two).apply(str);
        System.out.println("result = " + result);
    }
}
