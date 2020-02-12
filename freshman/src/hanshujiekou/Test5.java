package hanshujiekou;
import java.util.function.Function;
public class Test5 {
    public static void main(String[] args) {
        Integer num=stringToInteger("100",str->Integer.parseInt(str));
        int sum=num+100;
        System.out.println(sum);

        Integer num2=stringToInteger("998",Integer::parseInt);
        int sum2=num2+2;
        System.out.println(sum2);
    }
    public static Integer stringToInteger(String str,Function<String,Integer>function){
        Integer result=function.apply(str);
        return result;
    }
}
