package day12;

public class Woman extends Human {
    @Override
    public void sayHello() {
        method(super::sayHello);
    }
    private void method(Greetable lambda){
        lambda.greetable();
        System.out.println("I'm a woman");
    }
}
