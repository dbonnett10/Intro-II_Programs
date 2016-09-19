import java.util.*;

class StringBuild {
    public static void main(String[] args) {
         int N = Integer.parseInt(args[0]);

         StringBuilder mySB = new StringBuilder();
         long startTime = System.nanoTime();
         for (int i = 0; i < N; i++) {
            mySB.append("a");

         }

         long endTime = System.nanoTime();

          long timeElapsed = endTime - startTime;
        double seconds = (double)(timeElapsed/Math.pow(10, 9));

        System.out.println("Time elapsed: " + seconds);

    }
}
