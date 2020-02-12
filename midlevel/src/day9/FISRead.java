package day9;

import java.io.FileInputStream;
import java.io.IOException;

public class FISRead {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("fos.txt");
        int read=fis.read();
        System.out.println((char)read);
        read=fis.read();
        System.out.println((char)read);
        read=fis.read();
        System.out.println((char)read);
        read=fis.read();
        System.out.println((char)read);
        read=fis.read();
        System.out.println((char)read);
        read=fis.read();
        System.out.println(read);
        fis.close();
    }
}
