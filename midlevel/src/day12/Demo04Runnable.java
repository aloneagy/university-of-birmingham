package day12;

public class Demo04Runnable {
    private static void startThead(Runnable task){
        new Thread(task).start();
    }

    public static void main(String[] args) {
        startThead(()-> System.out.println("执行"));
    }
}
