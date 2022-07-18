package tasks08.task0812;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.max;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> alist = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            alist.add(s.nextInt());
        }
        int combo = 1;
        int maxCombo = 1;
        int currentNum = alist.get(0);
        for (int i = 1; i < 10; i++) {
            if (alist.get(i) == currentNum) combo++;
            else {
                combo = 1;
                currentNum = alist.get(i);
            }
            maxCombo = max(combo, maxCombo);
        }
        System.out.print(maxCombo);
    }
}
