package tasks07.task0706;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[15];
        for (int i = 0; i < 15; i++){
            a[i] = s.nextInt();
        }
        int chet = a[0];
        int nechet = 0;
        for (int i = 1; i<15; i+=2){
            nechet+=a[i];
            chet+= a[i+1];
        }
        if (chet>nechet) System.out.print("В домах с четными номерами проживает больше жителей.");
        else System.out.print("В домах с нечетными номерами проживает больше жителей.");

    }
}
