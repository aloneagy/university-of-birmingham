import java.util.Scanner;

public class intadd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数据");
        int a=sc.nextInt();
        System.out.println("请输入第二个数据");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum:"+sum);

    }
}
