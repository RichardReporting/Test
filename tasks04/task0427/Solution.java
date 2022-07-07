package tasks04.task0427;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(tripleNumberCatcher(n));

    }

    public static String tripleNumberCatcher(int n) {
        if ((n > 0) && (n < 1000)) {
            if (n > 99) {
                if (n % 2 == 0) return ("Четное трехзначное число");
                return ("Нечетное трехзначное число");
            }
            if (n > 9) {
                if (n % 2 == 0) return ("Четное двухзначное число");
                return ("Нечетное двухзначное число");
            }
            if (n % 2 == 0) return ("Четное однозначное число");
            else return ("Нечетное однозначное число");
        }
        return ("");
    }
}
