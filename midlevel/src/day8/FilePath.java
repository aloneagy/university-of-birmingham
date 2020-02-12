package day8;

import java.io.File;

public class FilePath {
    public static void main(String[] args) {
        File f=new File("D:\\bbb.java");
        System.out.println(f.getAbsolutePath());

        File f2=new File("bbb.java");
        System.out.println(f2.getAbsolutePath());
    }
}
