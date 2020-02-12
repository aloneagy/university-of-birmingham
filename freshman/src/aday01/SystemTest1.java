package aday01;

public class SystemTest1 {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        System.out.println("共耗时"+(end-start));
    }
}
