package daynine;

public class Fu {
    public void show(){
        System.out.println("fu类中的方法的show执行");
    }
    int num=5;
}
class Zi extends Fu{
    int num=6;
    public  void show(){
        System.out.println("zi类中的show2方法执行");
    }
}


