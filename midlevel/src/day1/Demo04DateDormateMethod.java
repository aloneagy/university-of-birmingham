package day1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo04DateDormateMethod {
    public static void main(String[] args) throws ParseException {
        DateFormat df=new SimpleDateFormat("yyyy年MM月dd日");
        String str="2019年12月11日";
        Date date=df.parse(str);
        System.out.println(date);

    }
}
