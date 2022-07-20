package tasks10.task1020;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arrayOfInts = new int[30];
        for (int i = 0; i < 30; i++){
            arrayOfInts[i] = s.nextInt();
        }
        Arrays.sort(arrayOfInts);
        System.out.print(arrayOfInts[9]+" "+ arrayOfInts[10]);
    }
}
