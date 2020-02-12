package day9;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSWrite2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("fos.txt");
        byte[] b="abcde".getBytes();
        fos.write(b);
        fos.close();
    }
}
