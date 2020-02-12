package day12;

public class Demo06MethodRef {
    private static void method(int num,Calcable calcable){
        System.out.println(calcable.calc(num));
    }



    public static void main(String[] args) {
        method(-10,Math::abs);
    }
}
