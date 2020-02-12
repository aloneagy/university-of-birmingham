package day10;

import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) throws FileNotFoundException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("jdk9.exe"));
             BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("copy.exe"));

        ) {
            int b;
            while ((b=bis.read())!=-1){
                bos.write(b);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
