package Toturial;

public class recursion {
    public static boolean mystery(int x){
        if(x==0)
            return true;
        if(x==1){
            return false;
        }
        if(x<0)
            return mystery(-x);
            else
                return mystery(x-2);

    }

    public static void main(String[] args) {
        System.out.println(mystery(9));
    }
}
