package day9;

import java.io.FileWriter;
import java.io.IOException;

public class FWWrite4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("fw.txt",true);
        fw.write("黑马");
        fw.write("\n");
        fw.write("程序员");
        fw.close();
    }

}
