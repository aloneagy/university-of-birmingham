package homework.WS1two;

import org.junit.jupiter.api.Test;

public class test {
    @Test
    public void test(){
        Car car = new Car("sasa", 999, 888, "red");
        System.out.println("car = " + car);
    }
    @Test
    public void test2(){
        Good milk = new Good("milk", 0.5);
        System.out.println("milk = " + milk);
    }
    @Test
    public void test3(){
        Film film =new Film("ee",new Date(9,"october",2019),10);
        System.out.println("film = " + film);
    }
}
