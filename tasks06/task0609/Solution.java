package tasks06.task0609;

import java.util.Scanner;

import static java.lang.Math.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int x2 = s.nextInt();
        int y1 = s.nextInt();
        int y2 = s.nextInt();

        System.out.printf("%.1f",getDistance(x1, y1, x2, y2));
    }

    public static double getDistance(int x1, int y1, int x2, int y2) {
        double dist = sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
        return (dist);
    }
}
