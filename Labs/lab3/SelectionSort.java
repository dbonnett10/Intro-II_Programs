import java.util.*;
import java.io.*;

class SelectionSort {

    public static void main(String[] args) {
        int myArray[] = {8, 3, 4, 2, 1};
        int min;

        for (int k = 0; k < myArray.length; k++) {


            System.out.print(myArray[k]);
        }

        System.out.println();


        for (int i = 0; i < myArray.length; i++) {
            min = i;
            for (int j = i + 1; j < myArray.length; j++){
                if (myArray[j] < myArray[min]) {
                    min = j;
                }

            }

            if (min != i) {
                final int temp = myArray[i];
                myArray[i] = myArray[min];
                myArray[min] = temp;
            }
            for (int k = 0; k < myArray.length; k++) {
                System.out.print(myArray[k]);
            }

            System.out.println();
        }
    }
}

