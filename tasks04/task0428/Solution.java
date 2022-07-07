package tasks04.task0428;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(positiveNumberCatcher(a, b, c));
    }

    public static int positiveNumberCatcher(int a, int b, int c) {
        int cnt = 0;
        if (a > 0) cnt++;
        if (b > 0) cnt++;
        if (c > 0) cnt++;
        return (cnt);
    }
}
