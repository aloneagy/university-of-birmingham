package day7;

public class Demo09InvokeCook {
    public static void main(String[] args) {
        invokeCook(()->System.out.println("吃饭了"));
    }
    private static void invokeCook(Cook cook){
        cook.makefood();
    }
}
