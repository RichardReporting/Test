package tasks01.task0132;

import java.util.Scanner;

public class Solution {
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(sumDigitsInNumber(n));
    }
    public static int sumDigitsInNumber(int number){
        return ((number/100)+(number/10%10)+(number%10));

    }
}