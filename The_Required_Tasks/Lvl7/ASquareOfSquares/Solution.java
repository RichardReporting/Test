package The_Required_Tasks.Lvl7.ASquareOfSquares;

import java.util.Scanner;

import static java.lang.Math.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.print(num + " ==> " + ifSquareOrNot(num));
    }

    public static boolean ifSquareOrNot(double n) {
        if (n == 0) return true;
        double sqrtOfN = sqrt(n);
            if (sqrtOfN == floor(sqrtOfN)) return true;
        return false;
    }

}
