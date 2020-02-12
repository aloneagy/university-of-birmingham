package lambda;

public class baozi {
    String pier;
    String xianer;
    boolean flag = false;
}

class Chihuo extends Thread {
    private baozi bz;

    public Chihuo(String name, baozi bz) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println("吃货正在吃"+bz.pier + bz.xianer + "包子");
                bz.flag = false;
                bz.notify();
            }
        }
    }
}