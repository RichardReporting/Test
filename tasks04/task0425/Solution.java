package tasks04.task0425;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.println(sectorFinder(x, y));
    }

    public static int sectorFinder(int x, int y) {
        if ((x < 0) & (y > 0)) return (1);
        if ((x > 0) & (y > 0)) return (2);
        if ((x > 0) & (y < 0)) return (3);
        return (4);
    }
}
