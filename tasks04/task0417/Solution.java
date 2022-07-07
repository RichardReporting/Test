package tasks04.task0417;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(ifEqual(a, b, c));
    }

    public static String ifEqual(int a, int b, int c) {
        if ((a == b) & (b == c)) return (a + " " + b + " " + c);
        if (a == b) return (a + " " + b);
        if (b == c) return (b + " " + c);
        if (a == c) return (a + " " + c);
        return ("");
    }
}
