package tasks04.task0423;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.toString();
        int age = s.nextInt();

    }

    public static String ifOldEnough(int age) {
        if (age > 20) return ("И 18 достаточно");
        return ("");
    }
}
