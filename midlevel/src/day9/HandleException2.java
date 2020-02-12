package day9;

import java.io.FileWriter;
import java.io.IOException;

public class HandleException2 {
    public static void main(String[] args) {
        try(FileWriter fw=new FileWriter("fw.txt");){
            fw.write("黑马程序员");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
