import java.util.*;
import java.io.*;

class Strings {
    public static void main(String[] args) {
     int N = Integer.parseInt(args[0]);


        String myString = new String();
        long startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            myString = myString + "a";
        } //for
        long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;
        double seconds = (double)(timeElapsed/Math.pow(10, 9));

      System.out.println("Time elapsed: " + seconds);


    } //main
} //class
