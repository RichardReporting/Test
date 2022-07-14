package tasks07.task0703;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] str = new String[10];
        int[] mass = new int[10];
        for (int i = 0; i < 10; i++) {
            str[i] = s.nextLine();
            mass[i] = str[i].length();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(mass[i]);

        }
    }
}
