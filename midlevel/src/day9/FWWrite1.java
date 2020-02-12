package day9;

import java.io.FileWriter;
import java.io.IOException;

public class FWWrite1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("fw.txt");
        fw.write('刷');
       // fw.flush();
        fw.write('新');
        fw.flush();

        fw.write('关');
        fw.close();

    }
}
