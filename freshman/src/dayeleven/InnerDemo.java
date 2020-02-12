package dayeleven;

public class InnerDemo {
    public static void main(String[] args) {
        new FlyAble(){
            public void fly(){
                System.out.println("我飞了");
            }
        }.fly();
    }
}
