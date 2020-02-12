package day9;

import java.io.FileReader;
import java.io.IOException;

public class FRRead {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("fos.txt");
        int b;
        while ((b=fr.read())!=-1){
            System.out.println((char)b);
        }
        fr.close();

    }
}
