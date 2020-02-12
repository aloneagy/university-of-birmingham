package day12;

public class DemoLambdaEatable {
    private static void doSomething(Eatable inter){
        inter.eat();
    }

    public static void main(String[] args) {
        doSomething(()-> System.out.println("吃饭"));
    }
}
