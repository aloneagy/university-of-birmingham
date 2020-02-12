package day5;

import java.io.FileNotFoundException;

public class ThrowsDemo {
    public static void main(String[] args) throws FileNotFoundException {
        read("a.txt");
    }

    private static void read(String path) throws FileNotFoundException {
        if(!path.equals("a.txt")){
            throw new FileNotFoundException("bucunzai");
        }
    }
}
