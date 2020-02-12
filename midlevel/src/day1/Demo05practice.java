package day1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo05practice {
    public static void function() throws Exception{
        System.out.println("input date");
        String birthdayString=new Scanner(System.in).next();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate=new Date();
        Date todayDate=new Date();
        long birthdaySecond=birthdayDate.getTime();
        long todaySecond=todayDate.getTime();
        long secone=todaySecond-birthdaySecond;
        if(secone<0){
            System.out.println("wrong");
        }
        else
        {
            System.out.println(secone/1000/60/60/24);
        }
    }
}
