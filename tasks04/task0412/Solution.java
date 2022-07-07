package tasks04.task0412;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ifPositiveOrNot(n);
    }

    public static int ifPositiveOrNot(int n) {
        if (n != 0) {
            int m = n / abs(n);
            switch (m) {

                case -1:
                    n++;
                    break;

                case 1:
                    n *= 2;
                    break;
            }
        }
        System.out.println(n);
        return (n);
    }
}
