import java.util.Random;
public class getrandom {
    public static void main(String[] args) {
        int n=50;
        Random r= new Random();
        int number=r.nextInt(n)+1;
        System.out.println("number:"+number);
    }

}
