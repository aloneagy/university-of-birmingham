package day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffered {
    public static void main(String[] args) throws FileNotFoundException {
        long start=System.currentTimeMillis();
        try (
                FileOutputStream fos = new FileOutputStream("jdk9.exe");
                FileInputStream fis=new FileInputStream("copy.exe");)
        {
            int b;
            while ((b=fis.read())!=-1){
                fos.write(b);
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);

    }
}
