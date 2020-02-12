package day9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamConstructor  {
    public static void main(String[] args) throws IOException {
        File file=new File("a.txt");
        FileInputStream fos=new FileInputStream(file);
        FileInputStream fos1=new FileInputStream("b.txt");

    }
}
