package day12;

public class Demo05 {
    private static void printCal(int num,Calcable calcable){
        System.out.println(calcable.calc(num));
    }

    public static void main(String[] args) {
        printCal(-10,s->Math.abs(s));
    }
}
