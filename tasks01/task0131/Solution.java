package tasks01.task0131;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(getMetreFromCentimetre(n));
    }
    public static int getMetreFromCentimetre(int centimetre) {
        return(centimetre / 100);
    }
}
