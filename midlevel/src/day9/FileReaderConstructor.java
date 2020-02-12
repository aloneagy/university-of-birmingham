package day9;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderConstructor {
    public static void main(String[] args) throws IOException {
        File file=new File("a.txt");
        FileReader fr=new FileReader(file);

        //FileReader fr1=new FileReader("b.txt");

    }
}
