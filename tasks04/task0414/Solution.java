package tasks04.task0414;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(amountOfDays(n));
    }

    public static String amountOfDays(int n) {
        if ((n % 4 == 0) && ((n % 100 == 0) == (n % 400 == 0))) {
            return ("Количество дней в году: 366");
        }
        return ("Количество дней в году: 365");
    }
}

