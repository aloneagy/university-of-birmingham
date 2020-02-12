package day6;

public class Demo1 {
    public static void main(String[] args) {
        MyRunnable mr=new MyRunnable();
        Thread t=new Thread(mr,"小强");
        t.start();
        for (int i = 0; i <20 ; i++) {
            System.out.println("旺财"+i);
        }
    }
}
