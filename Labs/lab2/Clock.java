import java.util.*;
import java.io.*;

public class Clock {

    private int hours;
    private int minutes;
    private int  seconds;
    private int days;
    private int year;
    private int month;
    private int amPm;

    public Clock(int hr, int min, int sec, int meridian, int mon, int d, int yr) {
        hours = hr;
        minutes = min;
        seconds = sec;
        days = d;
        year = yr;
        month = mon;
        amPm = meridian;
    }

    public void setTime(int hr, int min, int sec, int meridian, int mon, int d, int yr) {
        if (hr != -1)
            hours = hr;
        if (min != -1)
            minutes = min;
        if (sec != -1)
            seconds = sec;
        if (d != -1)
            days = d;
        if (yr != -1)
            year = yr;
        if (mon != -1)
            month = mon;
        if (meridian != -1)
            amPm = meridian;
    }

    public int getHour() {
        return hours;
    }

    public void setHour(int hr) {
        hours = hr;
    }

    public int getMinute() {
        return minutes;
    }

    public void setMinute(int min) {
        minutes = min;
    }

    public int getSecond() {
        return seconds;
    }

    public void setSecond(int sec) {
        seconds = sec;
    }

    public int getDay() {
        return days;
    }

    public void setDay(int d) {
        days = d;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int yr) {
        year = yr;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int mon) {
        month = mon;
    }

    public int getAmPm() {
        return amPm;
    }

    public void setAmPm(int meridian) {
        amPm = meridian;
    }

    public void printTime() {
        System.out.print("The time is: " + hours + ":" + minutes + ":" + seconds);
        if (amPm == 1)
            System.out.println(" PM");
        else if (amPm == 0)
            System.out.println(" AM");
        System.out.println();
        System.out.println(month + "/" + days + "/" + year);
    }

    public void addTime(int secs) {
        System.out.println("Adding " + secs +" seconds");
        hours += secs/3600;
        secs = secs%3600;
        minutes += secs/60;
        secs = secs%60;
        seconds += secs;

        if (seconds > 59) {
            seconds = seconds%60;
            minutes++;
        }

        if (minutes > 59) {
            minutes = minutes%60;
            hours++;
            hours = hours%12;
        }

        if (seconds < 0) {
            seconds += 60;
            minutes--;
        }

        if (minutes < 0) {
            minutes += 60;
            hours--;
        }

        if (hours < 0)
            hours += 12;

    }

}







