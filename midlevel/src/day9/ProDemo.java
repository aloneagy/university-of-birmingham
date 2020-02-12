package day9;

import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Set;

public class ProDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Properties properties=new Properties();

        properties.setProperty("filename","a.txt");
        properties.setProperty("length","209385");
        properties.setProperty("location","D:\\a.txt");

        System.out.println(properties);

        System.out.println(properties.getProperty("filename"));
        System.out.println(properties.getProperty("length"));
        System.out.println(properties.getProperty("location"));


        Set<String> Strings =properties.stringPropertyNames();
        for(String key:Strings){
            System.out.println(key+"---"+properties.getProperty(key));
        }
    }
}
