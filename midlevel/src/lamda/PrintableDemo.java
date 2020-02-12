package lamda;

public class PrintableDemo {
    public static void main(String[] args) {
     //   usePrintable((String s)-> System.out.println(s));
     //   usePrintable(s-> System.out.println(s));

        //方法应用符号 ::
        usePrintable(System.out::println);
        //可推导的就是可以省略的
    }
    private static void usePrintable(Printable p){
        p.printString("a");
    }
}
