package day6;

public class Demo {
    public static void main(String[] args) {
        System.out.println("线程");
        MyThread mt=  new MyThread("小强");
        mt.start();
        for (int i = 0; i <20 ; i++) {
            System.out.println("旺财"+i);

        }
    }
}
