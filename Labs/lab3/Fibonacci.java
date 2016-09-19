import java.lang.*;

class Fibonacci {
    public static void main(String[] args) {
        int fib0 = -1;
        int fib1 = -2;
        int goal = 7;

        System.out.println("The next five numbers are: ");

        for (int i = 1; i < goal-1; i++) {
            int temp = fib0 - (Math.abs(fib1));
            fib0 = fib1;
            fib1 = temp;

            System.out.println(temp);
        }

    }
}
