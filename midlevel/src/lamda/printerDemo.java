package lamda;

public class printerDemo {
    public static void main(String[] args) {
        //usePrinter(s-> {
//            String result = s.toUpperCase();
//            System.out.println(result);
     //       System.out.println(s.toUpperCase());
            //对象的实例方法
           PrintString ps=new PrintString();
           usePrinter(ps::printUpper);
      //  });
        //lamda表达式被对象是实例方法替代的时候，他的形式参数全部传递给方法作为参数
    }
    private static void usePrinter(Printer p){
        p.printUpperCase("helloworld");
    }
}
