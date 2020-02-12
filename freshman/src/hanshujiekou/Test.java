package hanshujiekou;

import java.util.ArrayList;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        int a=stringtoint("10",b->Integer.parseInt(b));
        System.out.println("a = " + a);
    }
    public static Integer stringtoint(String str, Function<String,Integer>function){
        int result=function.apply(str);
        return result;
    }
}
