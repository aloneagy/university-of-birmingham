package dayeleven;

public class Demo2 {
    public static void main(String[] args) {
        Outer outer=new Outer();
        Outer.Inner inner=outer.new Inner();
        inner.method2();
        System.out.println("---------------");
        Outer.Inner inner2=new Outer().new Inner();
        inner2.method2();
        System.out.println("---------------");
        Outer outer2=new Outer();
    }
}
