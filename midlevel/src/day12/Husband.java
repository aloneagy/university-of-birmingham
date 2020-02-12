package day12;

public class Husband {
    private void marry(Richable richable){
        richable.buy();
    }
    private  void beHappy(){
        marry(this::buythings);
    }
    public void buythings(){
        System.out.println("买东西");
    }
}
