package day8;

import java.io.File;
import java.io.FileFilter;

public class DiGuiDemo4 {
    public static void main(String[] args) {
        File dir=new File("D:\\aaa");
        printDir2(dir);
    }

    private static void printDir2(File dir) {
        File[] files=dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java")||pathname.isDirectory();
            }
        });
        for(File file:files){
            if(file.isFile()){
                System.out.println("文件名"+file.getAbsolutePath());
            }else {
                printDir2(file);
            }
        }
    }
}
