package Toturial;

public class totur {
    public static void main(String[] args) {

    }
    public static int countDigits(int x){
        int n=0;
        if(x<10){
            return 1;
        }
        else {
            return 1+countDigits(x/10);
        }
    }
}
