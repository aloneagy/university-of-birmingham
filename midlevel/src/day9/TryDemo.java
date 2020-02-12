package day9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryDemo {
    public static void main(String[] args) throws IOException {
        final FileReader fr=new FileReader("in.txt");
        FileWriter fw=new FileWriter("out.txt");
        try(fw;fw) {
            int b;
            while ((b=fr.read())!=-1){
                fw.write(b);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
