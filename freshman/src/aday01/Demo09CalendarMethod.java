package aday01;

import java.util.Calendar;
import java.util.Date;

public class Demo09CalendarMethod {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        Date date=cal.getTime();
        System.out.println(date);
    }
}
