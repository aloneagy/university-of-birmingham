package day9;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSWrite {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("fos.txt");
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.close();
    }
}
