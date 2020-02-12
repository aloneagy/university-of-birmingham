package homework.WS1two;

import java.util.Objects;
import java.util.SplittableRandom;

public class Date {
    private int day;
    private String month;
    private int year;

    public Date(int d, String m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int newDay) {
        day = newDay;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String newMonth) {
        month = newMonth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public String toString() {
        return day + " " + month + " " + year;
    }

    public boolean equals(Date date)
    {
        return (this.getDay()==date.getDay())&&(this.getMonth().equals(date.getMonth()))&&(this.getYear()==date.getYear());
    }


}
