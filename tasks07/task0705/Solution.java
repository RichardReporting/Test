package tasks07.task0705;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[20];
        int[] b = new int[10];
        int[] c = new int[10];
        for (int i = 0; i < 20; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            b[i] = a[i];
            c[i] = a[i + 10];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(c[i]);
        }
    }
}
