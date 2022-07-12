package tasks05.task0531;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution inputSol = new Solution();
        String input = "5 4 1 2 3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        //
        Scanner s = new Scanner(System.in);
        //
        int minNum = s.nextInt();
        for (int i = 0; i < 4; i++) {
            int newMin = s.nextInt();
            if (newMin < minNum) minNum = newMin;
        }
        //
        System.out.print(minNum);
    }
}
