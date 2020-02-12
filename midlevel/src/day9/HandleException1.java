package day9;

import java.io.FileWriter;
import java.io.IOException;

public class HandleException1 {
    public static void main(String[] args){
        FileWriter fw=null;
        try{
            fw=new FileWriter("fw.txt");
            fw.write("黑马程序员");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(fw!=null){
                    fw.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
