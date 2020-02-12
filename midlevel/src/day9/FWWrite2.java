package day9;

import java.io.FileWriter;
import java.io.IOException;

public class FWWrite2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("fw.txt");
        char[] chars="黑马程序员".toCharArray();
        fw.write(chars);
        fw.write(chars,2,2);
        fw.close();

    }
}
