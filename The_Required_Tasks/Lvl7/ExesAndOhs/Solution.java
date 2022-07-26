package The_Required_Tasks.Lvl7.ExesAndOhs;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        //String str = "ooxx";
        System.out.print(XAndOCounter(str));
    }

    public static boolean XAndOCounter(String str) {
        char[] charArray = str.toCharArray();
        int xCount = 0;
        int oCount = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.toLowerCase(charArray[i]) == 'o') oCount++;
            if (Character.toLowerCase(charArray[i]) == 'x') xCount++;
        }
        return oCount == xCount;
    }
}
