package day7;

public class Demo04ThreadNameless {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程执行");
            }
        }).start();
    }
}
