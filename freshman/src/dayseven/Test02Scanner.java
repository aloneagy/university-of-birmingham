package dayseven;

import java.util.Scanner;

public class Test02Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int tem=(a>b ?a:b);
        int max=(tem>c ?tem:c);
        System.out.println(max);
    }

}
