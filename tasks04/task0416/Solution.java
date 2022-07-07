package tasks04.task0416;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();
        System.out.println(ifGreenOrNot(n));
    }

    public static String ifGreenOrNot(double n) {
        double m = n % 5;
        if (m <= 3) return ("зелёный");
        if (m <= 4) return ("жёлтый");
        return ("красный");
    }
}
