package day5;

import java.io.FileNotFoundException;

public class TryCatchDemo {
    public static void main(String[] args) {
        try{
            read("b.txt");
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }

    private static void read(String path) throws FileNotFoundException {
        if(!path.equals("a.txt")){
            throw new FileNotFoundException("bucunzai");
        }
    }
}
