package tasks04.task0413;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        dayOfTheWeek(n);
    }

    public static String dayOfTheWeek(int n) {
        switch (n) {
            case 1:
                return ("Понедельник");
            case 2:
                return ("Вторник");
            case 3:
                return ("Среда");
            case 4:
                return ("Четверг");
            case 5:
                return ("Пятница");
            case 6:
                return ("Суббота");
            case 7:
                return ("Воскресение");
            default:
                return ("Такого дня недели не существует");

        }
    }
}
