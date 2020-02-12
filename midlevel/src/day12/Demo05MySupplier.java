package day12;

public class Demo05MySupplier {
    private static void printParam(Mysupplier a){
        System.out.println(a.get());
    }

    public static void main(String[] args) {
        printParam(()->"hello");
    }
}
