package structuralAdapter;

import java.time.chrono.HijrahDate;

public class HijriCalendar {
    private  int day;
    private  int month;
    private  int year;

    public HijriCalendar(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void displayHijriDate() {
        System.out.println("Hijri date: " + year + "/" + month + "/" + day);
    }
}
