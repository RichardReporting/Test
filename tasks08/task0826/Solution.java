package tasks08.task0826;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[20];
        for (int i = 0; i < 20; i++){
            a[i]= s.nextInt();
        }
        Arrays.sort(a);
        for (int i = 19; i > 14; i--){
            System.out.println(a[i]);
        }
    }
}
