package tasks04.task0418;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(minNum(a,b));
    }

    public static int minNum(int a, int b) {
        return (Math.min(a, b));
    }
}
