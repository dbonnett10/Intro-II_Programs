import java.util.*;
import java.text.DecimalFormat;

class BetterClock extends Clock {
    private double timeZone;
    DecimalFormat df;


    public BetterClock(int hr, int min, int sec, int d, int yr, int mon, int meridian, double tz) {
        super(hr, min, sec, meridian, mon, d, yr);
        timeZone = tz;
        df=new DecimalFormat("0.##");
    }

    public void setTime(int hr, int min, int sec, int d, int yr, int mon, int meridian, double tz) {
        super.setTime(hr, min, sec, meridian, mon, d, yr);
        timeZone = tz;
    }

    public void printTime() {
        super.printTime();
        System.out.println("GMT " + timeZone + ":00" );

        String tzOutput = "";
        if (timeZone%1 != 0) {
            tzOutput = (int)(timeZone/1) + ":" + df.format((timeZone%1) * 60);

        }
    }

    public void timeDifference(BetterClock bc) {
       /* bc.getMonth();
        bc.getDay();
        bc.getYear();
        bc.getHour();
        bc.getMinute();
        bc.getSecond();
        bc.getAmPm();
        */

        int myYear  = getYear();
        int newYear = bc.getYear();
        int yearDifference = 0;

        if (newYear > myYear) {
            yearDifference = newYear - myYear;
        }

        else if (myYear > newYear) {
            yearDifference = myYear - newYear;
        }

        int myMonth = getMonth();
        int newMonth = bc.getMonth();
        int monthDifference = 0;

        if (newMonth > myMonth) {
            monthDifference = newMonth - myMonth;
        }

        else if (newMonth < myMonth) {
            monthDifference = myMonth - newMonth;
        }

        int myDay = getDay();
        int newDay = bc.getDay();
        int dayDifference = 0;

        if (myDay < newDay) {
            dayDifference = newDay - myDay;
        }

        else if (myDay > newDay) {
            dayDifference = myDay - newDay;
        }

        int myHour = this.getHour();
        int newHour = bc.getHour();
        int hourDifference = 4;

        if (myHour < newHour) {
            hourDifference = newHour - myHour;
        }
        else if (myHour > newHour) {
            hourDifference = myHour - newHour;
        }

        int myMin = this.getMinute();
        int newMin = bc.getMinute();
        int minDifference = 0;

        if (myMin < newMin) {
            minDifference = newMin - myMin;
        }

        else if (myMin > newMin) {
            minDifference = myMin - newMin;
        }

        int mySec = getSecond();
        int newSec = bc.getSecond();
        int secDifference = 0;

        if(mySec < newSec) {
            secDifference = newSec - mySec;
        }

        else if (mySec > newSec) {
            secDifference = mySec - newSec;
        }

        System.out.println("The time differnce is: " + yearDifference + " years " + monthDifference + " months " + dayDifference + " days " + hourDifference + " hours " + minDifference + " minutes " + secDifference + " seconds ");
        System.out.println(myHour + " and " + newHour);


    } //timedifference

} //Betterclock class
