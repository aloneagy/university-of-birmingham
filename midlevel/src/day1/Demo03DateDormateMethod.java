package day1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo03DateDormateMethod {
    public static void main(String[] args) {
        Date date=new Date();

        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String str=df.format(date);
        System.out.println(str);
    }
}
