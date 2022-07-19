package tasks09.task0919;

import java.io.PrintStream;

public class Solution {
    public static void main(String[] args) {
        try {

            divisionByZero();
        } catch (ArithmeticException e) {
            StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
            PrintStream s = new PrintStream( System.out);
            e.printStackTrace(s);
        }

    }

    public static void divisionByZero() {
        System.out.println(3 / 0);
    }
}
