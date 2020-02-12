package day13;

import java.util.function.Predicate;

public class Demo15PredicateTest {
    private static void method(Predicate<String> predicate){
        boolean verylong=predicate.test("HelloWorld");
        System.out.println(verylong);
    }
    public static void main(String[] args) {
        method(s->s.length()>5);
    }
}
