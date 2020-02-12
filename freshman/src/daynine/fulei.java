package daynine;

public class fulei {
    private int n;
    fulei(){
        System.out.println("执行父类构造");

    }

}
class zilei extends fulei{
    zilei(){
        super();
        System.out.println("执行子类构造");
    }

}