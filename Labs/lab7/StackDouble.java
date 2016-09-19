import java.util.*;
import java.io.*;

class StackDouble {
    private int maxValue;
    private double[] arrayStack;
    private int topOfStack;

    public StackDouble(int max) {
        maxValue = max;
        arrayStack = new double[maxValue];
        topOfStack = -1;
    }

    public void push(double j) {
        arrayStack[++topOfStack] = j;
    }

    public double pop() {
        return arrayStack[topOfStack--];
    }

    public double peek() {
        return arrayStack[topOfStack];
    }

    public boolean isEmpty() {
        return (topOfStack == -1);
    }
}

