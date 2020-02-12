package day7;

public class Demo05InvokeCook {
    public static void main(String[] args) {
        invokeCook(()->{
            System.out.println("吃饭");
        });
    }
    public static void invokeCook(Cook cook){
        cook.makefood();
    }
}
