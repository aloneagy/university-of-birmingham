package day12;

public class DemoAssistant {
    private static void work(WorkHelper helper){
        helper.help("机密文件");
    }

    public static void main(String[] args) {
        Assisant assisant=new Assisant();
        work(assisant::dealFile);
    }
}
