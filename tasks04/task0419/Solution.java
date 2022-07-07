package tasks04.task0419;

import java.util.Scanner;

import static java.lang.Math.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        System.out.println(maxOfFour(a, b, c, d));
    }

    public static int maxOfFour(int a, int b, int c, int d) {
        return (max(max(a, b), (max(c, d))));
    }
}
