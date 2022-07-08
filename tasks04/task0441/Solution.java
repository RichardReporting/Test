package tasks04.task0441;

import java.util.Scanner;

import static java.lang.Math.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        midNumOf3(a, b, c);
    }

    public static void midNumOf3(int a, int b, int c) {
        System.out.print(min(max(a, b), (max(b, c))));
    }
}
