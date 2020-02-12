package day8;

import java.io.File;

public class DiGuiDemo2 {
    public static void main(String[] args) {
        File dir=new File("D:\\aaa");
        printDir(dir);
    }

    private static void printDir(File dir) {
        File[] files=dir.listFiles();
        for(File file:files){
            if(file.isFile()){
                System.out.println("文件名"+file.getAbsolutePath());
            }else {
                System.out.println("目录"+file.getAbsolutePath());
                printDir(file);
            }
        }
    }
}
