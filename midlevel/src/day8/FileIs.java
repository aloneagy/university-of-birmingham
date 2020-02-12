package day8;

import java.io.File;

public class FileIs {
    public static void main(String[] args) {
        File f=new File("d:\\aaa\\bbb.java");
        File f2=new File("d:\\aaa");

        System.out.println("d:\\aaa\\bbb.java是否存在"+f.exists());
        System.out.println("d:\\aaa"+f2.exists());


        System.out.println("d:\\aaa文件？："+f2.isFile());
        System.out.println("d:\\aaa目录？："+f2.isDirectory());
    }
}
