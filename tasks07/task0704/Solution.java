package tasks07.task0704;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = s.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            int n = array[i];
            array[i] = array[9 - i];
            array[9 - i] = n;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
    }
}
