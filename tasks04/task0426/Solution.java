package tasks04.task0426;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(numberCatcher(n));
    }

    public static String numberCatcher(int n) {
        if (n % 2 == 0) {
            if (n > 0)
                return ("Четное положительное число");
            if (n < 0)
                return ("Четное отрицательное число");
            return ("Ноль");
        }
        if (n > 0) return ("Нечетное положительное число");
        return ("Нечетное отрицательное число");
    }
}
