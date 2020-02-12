package lamda;

import java.util.function.Consumer;

public class ComsumerDemo {
    public static void main(String[] args) {
       // operatorString("林青霞",s-> System.out.println(s));
//        operatorString("林青霞",System.out::println);
//        operatorString("林青霞",s->{
//            System.out.println(new StringBuilder(s).reverse().toString());
//        });
//        operatorString("林青霞",s-> System.out.println(s),a-> {
//            System.out.println(new StringBuilder(a).reverse().toString());
//        });
    }
    //定义一个方法，消费一个字符串数据
    private static void operatorString(String name, Consumer<String>con){
        con.accept(name);
    }
    //消费一个字符串数据，用不同的方式消费同一个字符串两次
    private static void operatorStrings(String name,Consumer<String>con1,Consumer<String>con2){
        con1.accept(name);
        con2.accept(name);
    }
}
