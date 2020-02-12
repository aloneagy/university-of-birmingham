package dayseven;
import java.util.Scanner;

public class Test01Scanner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        System.out.println("请输入第一个整数");
        System.out.println("请输入第二个整数");
        int i =sc.nextInt();
        int x=sc2.nextInt();
        System.out.println(i+x);
    }

}
