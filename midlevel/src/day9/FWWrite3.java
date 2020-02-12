package day9;

import java.io.FileWriter;
import java.io.IOException;

public class FWWrite3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("fw.txt");
        String msg="黑马程序员";
        fw.write(msg);
        fw.write(msg,2,2);
        fw.close();

    }
}
