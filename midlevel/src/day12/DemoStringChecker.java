package day12;

public class DemoStringChecker {
    private static void methodCheck(StringCheck check){
        System.out.println(check.checkString(" "));
    }

    public static void main(String[] args) {
       methodCheck(StringUtils::isBlank);
    }
}
