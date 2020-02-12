package dayten;

public class Test {
    public static void main(String[] args) {
        Amimal1 a1=new Cat();
        a1.eat();
        Cat c=(Cat)a1;
        c.catchMouse();

        Amimal1 a2=new Dog();
        a2.eat();
    }
}
