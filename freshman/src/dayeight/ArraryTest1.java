package dayeight;

import java.util.Arrays;

public class ArraryTest1 {
    public static void main(String[] args) {
        String line="ysKUreayWTRHsgFdSAidq";
        char[] chars=line.toCharArray();
                Arrays.sort(chars);
        for(int i=chars.length-1;i>=0;i--){
            System.out.println(chars[i]+" ");
        }
    }
}
