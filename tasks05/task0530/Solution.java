package tasks05.task0530;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution inputSol = new Solution();
        String input = "5 4";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        //
        Scanner s = new Scanner(System.in);
        //
        int a = s.nextInt();
        int b = s.nextInt();
        //
        System.out.print(a + b);
    }
}
