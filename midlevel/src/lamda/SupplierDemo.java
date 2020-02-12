package lamda;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
       // getString(()->"l");
        String s=getString(()->"l");
        System.out.println(s);

        Integer i=getInteger(()->10);
        System.out.println(i);
    }
    private static String getString(Supplier<String> sup){
        return sup.get();
    }
    private static Integer getInteger(Supplier<Integer> sup){
        return sup.get();
    }
}
