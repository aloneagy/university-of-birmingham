package daynine;

public class Employee {
    String name;
    public void work(){
        System.out.println("尽心尽力地工作");
    }
}
class Teacher extends Employee{
    public void printName(){
        System.out.println("name="+name);
    }
}
