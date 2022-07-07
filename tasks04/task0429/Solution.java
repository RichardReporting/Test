package tasks04.task0429;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(posNNegNumCatcher(a, b, c));
    }

    public static String posNNegNumCatcher(int a, int b, int c) {
        int pos = 0;
        int neg = 0;
        if (a > 0) pos++;
        if (b > 0) pos++;
        if (c > 0) pos++;
        if (a < 0) neg++;
        if (b < 0) neg++;
        if (c < 0) neg++;
        return ("Количество отрицательных чисел: " + neg + "\nКоличество положительных: " + pos);
    }
}
