package tasks05.task0532;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution inputSol = new Solution();
        String input = "-2 0 3 1 8 2";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        //
        Scanner s = new Scanner(System.in);
        //
        int n = s.nextInt();
        do {
            System.out.println("Число должно быть больше нуля");
            n = s.nextInt();
        } while (n <= 0);

        int maxNum = s.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int newMax = s.nextInt();
            if (newMax > maxNum) maxNum = newMax;
        }
        //
        System.out.print(maxNum);
    }
}
