package day12;

public class Demo01Logger {
    private static void log(int level,String msg){
        if(level==1){
            System.out.println(msg);
        }
    }
    public static void main(String[] args) {
        String msgA ="hello";
        String msgB ="world";
        String msgC ="java";
        log(1,msgA+msgB+msgC);
    }
}
