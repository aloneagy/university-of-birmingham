package aday01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class jisuan {
    public static void function() throws ParseException {
        System.out.println("请输入出生日期 格式 YYYY-MM-dd");
        String birthdayString=new Scanner(System.in).next();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate=sdf.parse(birthdayString);
        Date todayDate=new Date();
        long birthdaySecond=birthdayDate.getTime();
        long todaySecond=todayDate.getTime();
        long seone=todaySecond-birthdaySecond;
        if(seone<0){
            System.out.println("no");
        }else{
            System.out.println(seone/1000/60/60/24);
        }



    }
}
