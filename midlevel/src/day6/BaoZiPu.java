package day6;

public class BaoZiPu extends Thread {
    private Baozi bz;
    public BaoZiPu(String name,Baozi bz){
        super(name);
        this.bz=bz;
    }


    @Override
    public void run(){
        int count=0;
        while (true){
            synchronized (bz){
                if(bz.flag==true)
                    try {
                        bz.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
            }
            System.out.println("做包子");
            if(count%2==0){
                bz.pier="a";
                bz.xianer="1";
            }else {
                bz.pier="b";
                bz.xianer="2";
            }
            count++;
            bz.flag=true;
            System.out.println("chi");
            bz.notify();
        }
    }
}
