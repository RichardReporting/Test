package tasks03.task0319;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int money = s.nextInt();
        int year = s.nextInt();
        String name = s.next();
        inYears2(name, money, year);
    }

    public static void inYears2(String name, int money, int year) {
        System.out.print(name + " получает " + money + " через " + year + " лет.");
    }
}
