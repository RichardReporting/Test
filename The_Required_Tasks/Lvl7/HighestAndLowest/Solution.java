package The_Required_Tasks.Lvl7.HighestAndLowest;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String strOfNum = s.nextLine();
        String[] arrayOfNum = strOfNum.split(" ");
        Arrays.sort(arrayOfNum);
        System.out.print(arrayOfNum[arrayOfNum.length - 1] + " " + arrayOfNum[0]);
    }
}
