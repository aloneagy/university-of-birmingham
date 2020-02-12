package lamda;

public class MyStringDemo {
    public static void main(String[] args) {
     //   useMyString((String s,int x,int y)->s.substring(x,y));
     //   useMyString((s,x,y)->s.substring(x,y));
        //y引用类中的实例方法
        useMyString(String::substring);
        //lamda表达式被类的实例方法替代的时候
        //第一个参数作为调用者，后面的参数会全部传递给该方法作为参数

    }
    private static void useMyString(MyString my){
        String s=my.mySubString("HelloWorld",2,5);
        System.out.println(s);

    }
}
