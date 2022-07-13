package tasks06.task0606;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();
        ifOddOrEven(n);
    }

    public static void ifOddOrEven(long n) {
        int odd = 0;
        int even = 0;
        while (n > 0) {
            if ((n % 10) % 2 == 0) even++;
            else odd++;
            n /= 10;
        }
        System.out.print("Even: " + even + " Odd: " + odd);
    }
}
