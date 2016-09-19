import java.util.*;
import java.io.*;

class SinglyLinked {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        SinglyLinkedList<Integer> mySList = new SinglyLinkedList<Integer>();

        long startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            mySList.add(i);
        }

         long endTime = System.nanoTime();

         long timeElapsed = endTime - startTime;
        double seconds = (double)(timeElapsed/Math.pow(10, 9));

        System.out.println("Time elapsed: " + seconds);


        long sTime = System.nanoTime();
        for (int j = 0; j < N; j++) {
            int boom = mySList.get(j);
        }

         long eTime = System.nanoTime();

         long timePassed = eTime - sTime;
        double secs = (double)(timePassed/Math.pow(10, 9));

        System.out.println("Time elapsed: " + secs);

    }
}
