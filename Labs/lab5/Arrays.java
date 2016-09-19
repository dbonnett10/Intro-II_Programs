import java.util.*;
import java.io.*;

class Arrays {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] myArray = new int[N];

        long startTime = System.nanoTime();

        for (int i = 0; i < N; i++) {
            myArray[i] = i;
        }

        long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;
        double seconds = (double)(timeElapsed/Math.pow(10, 9));

        System.out.println("Time elapsed: " + seconds);


        //Retrieval process
        long sTime = System.nanoTime();

        for (int j = 0; j < N; j++) {
            int something = myArray[j];
        }

        long eTime = System.nanoTime();

        long timePassed = eTime - sTime;
        double secs = (double)(timePassed/Math.pow(10, 9));

        System.out.println("Retrieval process time elapsed: " + secs);


    }
}
