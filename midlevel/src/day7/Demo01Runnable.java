package day7;

public class Demo01Runnable {
    public static void main(String[] args) {
        Runnable task=new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程任务执行");
            }
        };
        new Thread(task).start();
    }
}
