package tasks04.task0442;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        sumByNeg1();
    }

    public static void sumByNeg1() {
        Scanner s = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        do {
            n = s.nextInt();
            sum += n;
        } while (n != -1);
        System.out.print(sum);
        return;
    }
}
