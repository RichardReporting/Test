package tasks08.task0827;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(str + " = " + isDateOff(str));
    }

    public static boolean isDateOff(String date) {
        String month = null;
        int sum = 0;
        char[] chars = date.toCharArray();
        int i = 0;
        while (chars[i] != ' ') {
            month += chars[i];
            i++;
        }
        i++;

        switch (month) {
            case "JANUARY":
                sum = 0;
            case "FEBRUARY":
                sum = 31;
            case "MARCH":
                sum = 59;
            case "APRIL":
                sum = 90;
            case "MAY":
                sum = 120;
            case "JUNE":
                sum = 151;
            case "JULY":
                sum = 181;
            case "AUGUST":
                sum = 212;
            case "SEPTEMBER":
                sum = 243;
            case "OCTOBER":
                sum = 273;
            case "NOVEMBER":
                sum = 304;
            case "DECEMBER":
                sum = 334;
        }

        String stDay = "";
        while (chars[i] != ' ') {
            stDay += chars[i];
            i++;
        }
        i++;
        int day = Integer.parseInt(stDay);
        sum += day;

        String stYear = "";
        int check = i;
        while (i < check + 4) {
            stYear += chars[i];
            i++;
        }
        int year = Integer.parseInt(stYear);
        if (sum > 58) sum += amountOfDays(year);
        return (!(sum % 2 == 0));
    }

    public static int amountOfDays(int n) {
        if ((n % 4 == 0) && ((n % 100 == 0) == (n % 400 == 0))) {
            return 1;
        }
        return 0;
    }
}



