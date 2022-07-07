package tasks04.task0433;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        addSSS();
    }

    public static void addSSS() {
        int i = 10;
        int j = 10;
        while (i > 0) {
            while (j > 0) {
                System.out.print("S");
                j--;
            }
            i--;
            j = 10;
            System.out.println("");
        }
    }
}
