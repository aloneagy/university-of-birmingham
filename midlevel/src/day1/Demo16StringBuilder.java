package day1;

public class Demo16StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello").append("World").append("Java");
        String str=sb.toString();
        System.out.println(str);
    }


}
