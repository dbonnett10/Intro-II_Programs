import java.util.*;

public class ClockMain {

    public static void main(String[] args) {
        Clock c = new Clock(9, 42, 25, 30, 2015, 1, 1);
        c.addTime(-10000);
        c.printTime();
    }

} //class
