package aday01;

import java.util.Calendar;

public class Demo08CalendarMethod {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();

        int year=cal.get(Calendar.YEAR);
        int month=cal.get(Calendar.MONTH);
        int dayofMonth=cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+dayofMonth+"日");
        cal.add(Calendar.DAY_OF_MONTH,2);
        cal.add(Calendar.YEAR,-3);
        System.out.println(cal.get(Calendar.YEAR)+"年"+cal.get(Calendar.MONTH)+"月"+cal.get(Calendar.DAY_OF_MONTH)+"日");
    }

    }//日期没变

