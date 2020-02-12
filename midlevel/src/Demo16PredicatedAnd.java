import java.util.function.Predicate;

public class Demo16PredicatedAnd {
    private static void method(Predicate<String>one,Predicate<String>two){
        boolean isValid=one.and(two).test("helloworld");
        System.out.println(isValid);
    }
    public static void main(String[] args) {
        method(s->s.contains("h"),s ->s.contains("w"));
    }
}
