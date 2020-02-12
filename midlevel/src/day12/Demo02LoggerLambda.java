package day12;

public class Demo02LoggerLambda {
    private static void log(int level,MessageBuilder builder){
        if(level==1){
            System.out.println(builder.buildMessage());
        }
    }

    public static void main(String[] args) {
        String msgA ="hello";
        String msgB ="world";
        String msgC ="java";
        log(2,()->{
            System.out.println("执行");
            return msgA+msgB+msgC;
        });
    }
}
