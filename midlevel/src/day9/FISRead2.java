package day9;

import java.io.FileInputStream;
import java.io.IOException;

public class FISRead2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("fos.txt");
        int len;
        byte[] b=new byte[2];
        while ((len=fis.read(b))!=-1){
            System.out.println(new String(b));
        }
        fis.close();
    }
}
