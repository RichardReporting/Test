package tasks07.task0701;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[] mass = new int[20];
        mass = initializeArray();
        System.out.print(max(mass));
    }

    public static int[] initializeArray() {
        Scanner s = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = s.nextInt();
        }
        return (array);
    }

    public static int max(int[] array) {
        int maxOfArray = array[0];
        for (int i = 1; i < 20; i++) {
            if (array[i] > maxOfArray) maxOfArray = array[i];
        }
        return (maxOfArray);
    }

}
