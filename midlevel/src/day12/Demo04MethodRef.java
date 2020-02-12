package day12;

public class Demo04MethodRef {
    private static void printString(Printable lambda){
        lambda.print("Hello");
    }

    public static void main(String[] args) {
        MethodRefObject a=new MethodRefObject();
        printString(a::printUpper);
    }
}
