import java.util.*;
import java.io.*;

class Linked {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        LinkedList<Integer> myList = new LinkedList<Integer>();

         long startTime = System.nanoTime();

        for (int i = 0; i < N; i++) {
            myList.add(i);
        }

         long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;
        double seconds = (double)(timeElapsed/Math.pow(10, 9));

      System.out.println("Time elapsed: " + seconds);


    long sTime = System.nanoTime();
    for (int j = 0; j < N; j++) {
        int var = myList.get(j);
    }

    long eTime = System.nanoTime();

         long timePassed = eTime - sTime;
        double secs = (double)(timePassed/Math.pow(10, 9));

        System.out.println("Retrieval time elapsed: " + secs);

    }

}
