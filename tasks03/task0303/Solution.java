package tasks03.task0303;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        convertEurToUsd(a,1.15);
        convertEurToUsd(b, 0.85);
    }

    public static void convertEurToUsd(int value, double mod){
        System.out.println( value * mod );
    }
}
