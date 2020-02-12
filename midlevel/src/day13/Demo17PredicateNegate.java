package day13;

import java.util.function.Predicate;

public class Demo17PredicateNegate {
    private static void method(Predicate<String> predicate){
        boolean verylong=predicate.negate().test("Helloword");
        System.out.println(verylong);
    }

    public static void main(String[] args) {
        method(s -> s.length()<5);
    }
}
