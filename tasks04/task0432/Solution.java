package tasks04.task0432;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int n = s.nextInt();
        multiStrings(str, n);
    }

    public static void multiStrings(String str, int n) {
        while (n > 0) {
            System.out.println(str);
            n--;
        }
        return;
    }
}
