package tasks04.task0411;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        checkSeason(n);
    }

    public static String checkSeason(int n) {
        switch (n) {
            case 1:
            case 2:
            case 12:
                return ("зима");
            case 3:
            case 4:
            case 5:
                return ("весна");
            case 6:
            case 7:
            case 8:
                return ("лето");
            case 9:
            case 10:
            case 11:
                return ("осень");
        }
        return ("");
    }
}
