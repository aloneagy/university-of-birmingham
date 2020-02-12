package day9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteConstructor {
    public static void main(String[] args) throws IOException {
        File file=new File("a.txt");
        FileWriter fw=new FileWriter(file);

       // FileWriter fw=new FileWriter("b.txt");
    }

}
