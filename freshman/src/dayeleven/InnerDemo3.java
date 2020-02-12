package dayeleven;

public class InnerDemo3 {
    public static void main(String[] args) {
        showFly(new FlyAble(){
            public void fly(){
                System.out.println("我飞了～～");
            }
        });
    }
    public static void showFly(FlyAble f){
        f.fly();
    }
}
