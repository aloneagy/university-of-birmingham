package day5;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowDemo2 {
    public static void main(String[] args) throws IOException {
        read("a.txt");
    }

    private static void read(String path) throws FileNotFoundException,IOException {
        if(!path.equals("a.txt")){
            throw new FileNotFoundException("bucunzai");
        }
        if(!path.equals("b.txt")){
            throw new IOException();
        }
    }
}
