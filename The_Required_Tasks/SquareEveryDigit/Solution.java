package The_Required_Tasks.SquareEveryDigit;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(theSquarer(n));
    }


    public static Integer theSquarer(int n) {
        var nums = String.valueOf(n).split("");
        StringBuilder result = new StringBuilder("");
        for (String num : nums) {
            var numAsInt = Integer.valueOf(num);
            final String temp = String.valueOf(numAsInt * numAsInt);
            result.append(temp);
        }
        return Integer.parseInt(result.toString());
    }
}
