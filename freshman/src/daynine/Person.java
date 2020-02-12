package daynine;

public class Person {
    String name;
    int age;
    int moeny=100;
    public  Person(){}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
    class Chinese extends Person{
    String address;
    int money=200;
    public Chinese(){ }
    public  Chinese(String name,int age,String address)
    {
        super(name,age);
        this.address=address;
    }
}