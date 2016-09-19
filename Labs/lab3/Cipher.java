import java.util.*;
import java.io.*;

class Cipher {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a message");
        String message = scan.nextLine();

        System.out.println("Would you like to Cipher your message (1 = yes, 2 = no)");
        int answer = scan.nextInt();

        if (answer == 1) {
            System.out.println(Cipher.encrypt(message,7));
            System.out.println(Cipher.decrypt(Cipher.encrypt(message,7), 7));
            //Changing the 7 to another int, such as 5, will add 5 letter indexes to the original (so b would equal g)
        }
        else {
            System.out.println("Alrighty then");
        }
    }

    public static String encrypt(String enc, int shift) {
        shift = shift % 26 + 26;
        StringBuilder encrypted = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encrypted.append((char) ('A' + (i - 'A' + shift) % 26));
                } //2nd if
                else {
                    encrypted.append((char) ('a' + (i - 'a' + shift) % 26));

                } //else
            } //first if
            else {
                encrypted.append(i);
            } //2nd else

        } //for

        return encrypted.toString();

    } //encrypt

    public static String decrypt(String enc, int shift) {
        return encrypt(enc, 26-shift);
    } //decrypt

} //Cipher class
