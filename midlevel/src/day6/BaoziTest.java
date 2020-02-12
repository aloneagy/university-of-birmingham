package day6;

public class BaoziTest {
    public static void main(String[] args) {
        Baozi bz=new Baozi();
        BaoZiPu bzp=new BaoZiPu("包子铺",bz);
        ChiHuo ch=new ChiHuo("吃货",bz);
        ch.start();
        bzp.start();
    }
}
