package day12;

public class Demo01PrintSimple {
    private static void print(Printable a){
        a.print("HelloWorld");
    }

    public static void main(String[] args) {
        print(s-> System.out.println(s));
    }

}
