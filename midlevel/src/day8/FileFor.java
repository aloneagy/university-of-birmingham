package day8;

import java.io.File;

public class FileFor {
    public static void main(String[] args) {
        File dir=new File("Users/zhangyongnan/Desktop/University of Birmingham\n");
        String[] names=dir.list();
        for(String name:names){
            System.out.println(name);
        }
        File[] files=dir.listFiles();
        for(File file:files){
            System.out.println(file);
        }
    }
}
