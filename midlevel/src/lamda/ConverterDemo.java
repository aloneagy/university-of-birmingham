package lamda;

public class ConverterDemo {
    public static void main(String[] args) {
      //  useConverter(s->Integer.parseInt(s));
        //lamda表达式被类方法替代时候，他的形式参数全部传递给静态方法作为参数
        useConverter(Integer::parseInt);
    }
    private static void useConverter(Converter c){
        int number=c.convert("600");
        System.out.println(number);
    }
}
