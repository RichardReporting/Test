package tasks06.task0622;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.*;

import static java.lang.System.out;

public class Solution {
    public static void main(String[] args) {
        Solution inputSol = new Solution();
        String input = "91 8 4 29 16";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        //
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();
        final List<Integer> list = Arrays.asList(a, b, c, d, e);
        Collections.sort(list);
        for (int l : list) {
            out.print(l);
            out.print(' ');
        }
    }

    public static void print(int n) {
        out.print(n + ' ');
    }
}
