package day9;

import java.io.FileWriter;
import java.io.IOException;

public class FWWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("fw.txt");
        fw.write(97);
        fw.write('b');
        fw.write('c');
        fw.write(30000);
        fw.close();
    }
}
