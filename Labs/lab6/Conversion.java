import java.io.*;
import java.util.*;

public class Conversion {
    private Stack s;

    private String inStr;

    private String output = "";

    public Conversion(String in) {
        inStr = in;
        int size = inStr.length();
        s = new Stack(size);
    } //conversion constructor

    public String transition() {
        for (int i = 0; i < inStr.length(); i++) {
            char currChar = inStr.charAt(i);
            switch (currChar) {
                case '+':
                case '-':
                    isOperation(currChar, 1);
                    break;
                case '^':
                    isOperation(currChar, 2);
                    break;
                case '*':
                case '/':
                    isOperation(currChar, 3);
                    break;
                case '(':
                    s.push(currChar);
                    break;
                case ')':
                    isParentheses(currChar);
                    break;
                default:
                    output = output + currChar;
                    break;
            } //switch statement
        } //for loop
        while (!s.isEmpty()) {
            output = output + s.pop();

        } //while loop
        return output;
    } //transition method

    public void isOperation(char oper, int precedence1) {
        while (!s.isEmpty()) {
            char fOper = s.pop();
            if (fOper == '(') {
                s.push(fOper);
                break;
            } //if
            else {
                int precedence2;
                if (fOper == '+' || fOper == '-')
                    precedence2 = 1;
                else
                    precedence2 = 2;
                if (precedence2 < precedence1) {
                    s.push(fOper);
                    break;
                }
                else
                    output = output + fOper;
            } //first else
        } // while loop
        s.push(oper);
    } //isOperation method

    public void isParentheses(char currChar){
        while (!s.isEmpty()) {
            char temp = s.pop();
            if (temp == '(')
                break;
            else
                output = output + temp;
        } //while loop
    } //isParentheses method

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an equation such as 4+3*8 (Can use operators: +,-,^,*,/, and parentheses)");
        String inStr = scan.nextLine();
        String output;
        Conversion convert = new Conversion(inStr);
        output = convert.transition();
        System.out.println("The Postfix equation is " + output);

    } //main

} //Conversion class
