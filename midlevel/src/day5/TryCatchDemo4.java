package day5;

import java.io.FileNotFoundException;

public class TryCatchDemo4 {
    public static void main(String[] args) {
        try{
            read("a.txt");
        }catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }
        finally{
            System.out.println("zhixing");
        }
        System.out.println("over");

    }

    private static void read(String path) throws FileNotFoundException {
        if(!path.equals("a.txt")){
            throw new FileNotFoundException("wenjianbucunzai");
        }
    }

}

