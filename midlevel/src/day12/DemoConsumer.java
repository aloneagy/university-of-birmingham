package day12;

import java.util.function.Consumer;

public class DemoConsumer {
    public static void main(String[] args) {
        String[] arr={"a,1","b,2","c,3"};
        printInfo(s-> System.out.println("姓名"+s.split(",")[0]),
                s-> System.out.println("。姓名"+s.split(",")[1]+"."),arr);
    }
    private static void printInfo(Consumer<String> one,Consumer<String>two,String[] arr){
        for(String info:arr){
            one.andThen(two).accept(info);
        }
    }

}
