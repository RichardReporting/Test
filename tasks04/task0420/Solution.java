package tasks04.task0420;

import java.util.Scanner;

import static java.lang.Math.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(fromTopToBot(a, b, c));
    }

    public static String fromTopToBot(int a, int b, int c) {
        int first = max(max(a, b), max(b, c));
        int second = max(min(a, b), min(b, c));
        int third = min(min(a, b), min(b, c));

        return (first + " " + second + " " + third);
    }
}
