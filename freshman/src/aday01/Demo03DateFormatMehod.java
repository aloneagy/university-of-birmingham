package aday01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo03DateFormatMehod {
    public static void main(String[] args) {
        Date date=new Date();
        DateFormat df=new SimpleDateFormat("yyyy年mm月dd日");
        String str=df.format(date);
        System.out.println(str);
    }
}
