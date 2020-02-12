package aday01;

import java.util.Calendar;

public class CalendarUnit {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();

        int year=cal.get(Calendar.YEAR);
        int month=cal.get(Calendar.MONTH);
        int dayofMonth=cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+dayofMonth+"日");
    }


}
