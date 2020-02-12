package day8;

import java.io.File;
import java.io.IOException;

public class FileCreatDelete {
    public static void main(String[] args) throws IOException {
        File f=new File("wenjian.txt");
        System.out.println("是否存在"+f.exists());
        System.out.println("是否创建"+f.createNewFile());
        System.out.println("是否存在"+f.exists());
        System.out.println("-----------------------");


        File f2=new File("newDir");
        System.out.println("是否存在"+f2.exists());
        System.out.println("是否创建"+f2.mkdir());
        System.out.println("是否存在"+f2.exists());
        System.out.println("-----------------------");



        File f3=new File("newDira\\newDirb");
        System.out.println(f3.mkdir());
        File f4=new File("newDira\\newDirb");
        System.out.println(f4.mkdirs());


        System.out.println(f.delete());
        System.out.println(f2.delete());
        System.out.println(f4.delete());
    }
}
