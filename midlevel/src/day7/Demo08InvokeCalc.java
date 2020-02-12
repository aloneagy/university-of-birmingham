package day7;

public class Demo08InvokeCalc {
    public static void main(String[] args) {
        invokeCalc(120,130,(a,b)->{return a+b;});
    }
    public static void invokeCalc(int a,int b,Calculator calculator){
        int result=calculator.calc(a,b);
        System.out.println(result);
    }
}
