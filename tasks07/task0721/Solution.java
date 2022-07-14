package tasks07.task0721;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[20];
        array[0] = s.nextInt();
        int amin = array[0];
        int amax = array[0];
        for (int i = 1; i < 20; i++) {
            array[i] = s.nextInt();
            if (array[i] < amax) amax = array[i];
            if (array[i] > amin) amin = array[i];
        }
        System.out.print(amin + "\n" + amax);
    }
}
