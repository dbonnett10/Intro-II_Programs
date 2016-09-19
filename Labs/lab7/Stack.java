import java.util.*;
import java.io.*;

class Stack {
    private int maxValue;
    private char[] arrayStack;
    private int topOfStack;

    public Stack(int max) {
        maxValue = max;
        arrayStack = new char[maxValue];
        topOfStack = -1;
    }

    public void push(char j) {
        arrayStack[++topOfStack] = j;
    }

    public char pop() {
        return arrayStack[topOfStack--];
    }

    public char peek() {
        return arrayStack[topOfStack];
    }

    public boolean isEmpty() {
        return (topOfStack == -1);
    }
}

