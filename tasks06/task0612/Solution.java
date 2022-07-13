package tasks06.task0612;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(Calculator.plus(a, b));
        System.out.println(Calculator.minus(a, b));
        System.out.println(Calculator.multiply(a, b));
        System.out.println(Calculator.division(a, b));
        System.out.print(Calculator.percent(a, b));
    }
}

class Calculator {
    int a;
    int b;

    public static int plus(int a, int b) {
        int c = a + b;
        return (c);
    }

    public static int minus(int a, int b) {
        int c = a - b;
        return (c);
    }

    public static int multiply(int a, int b) {
        int c = a * b;
        return (c);
    }

    public static double division(int a, int b) {
        double c = a / b;
        return (c);
    }

    public static double percent(int a, int b) {
        double c = b * 0.01;
        c *= a;
        return (c);
    }
}
