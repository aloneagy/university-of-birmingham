package day12;

public class Man extends Human {
    @Override
    public void sayHello() {
        method(()->super.sayHello());
    }
    private void method(Greetable greetable){
        greetable.greetable();
        System.out.println("I'm a man");
    }

    public static void main(String[] args) {
        Man man=new Man();
        man.sayHello();
    }
}
