package day1;

public class Demo12StringBuilder {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        StringBuilder builder2=builder.append("hello");

        System.out.println(builder);
        System.out.println(builder2);
        System.out.println(builder==builder2);

        builder.append("hello");
        builder.append("world");
        builder.append(true);
        builder.append(100);
        builder.append("hello").append("world").append(true).append(100);
        System.out.println(builder);
    }
}
