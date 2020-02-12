package day12;

public class Demo09FunctionalInterface {
    private  static void doSomething(MyFunctionalInterface inter){
        inter.myMethod();
    }

    public static void main(String[] args) {
        doSomething(() -> System.out.println("lambda执行"));
    }
}
