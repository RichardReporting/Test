package The_Required_Tasks.Lvl7.GetTheMiddleCharacter;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.print(getMiddle(str));
    }

    public static String getMiddle(String str) {
        char[] charOfStr = str.toCharArray();
        int lengthOfString = str.length();
        final int middleIndex = lengthOfString / 2;

        return (lengthOfString % 2 == 0)
                ? String.valueOf(charOfStr).substring(middleIndex - 1, middleIndex + 1)
                : String.valueOf(charOfStr).substring(middleIndex, middleIndex + 1);

    }
}
