package tasks07.task0702;

import java.util.Scanner;

public class Solution {

    public static String[] massiveMaker() {
        Scanner s = new Scanner(System.in);
        String[] str = new String[10];
        for (int i = 0; i < 8; i++) {
            str[i] = s.nextLine();
        }
        return (str);
    }

    public static void massiveReverser(String[] str) {
        for (int i = 9; i >= 0; i--) {
            System.out.println(str[i]);
        }
    }

    public static void main(String[] args) {
        String[] str = new String[10];
        str = massiveMaker();
        massiveReverser(str);
    }
}
