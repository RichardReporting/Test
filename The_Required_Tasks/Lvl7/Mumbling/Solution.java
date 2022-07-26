package The_Required_Tasks.Lvl7.Mumbling;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        //String str = "abcd";
        char[] charArray = str.toCharArray();
        int cLength = charArray.length - 1;
        for (int i = 0; i < cLength; i++) {
            mumbler(charArray[i], i);
            System.out.print('-');
        }
        mumbler(charArray[cLength], cLength);

    }

    public static void mumbler(char charArray, int i) {
        System.out.print(Character.toUpperCase(charArray));
        for (int j = 0; j < i; j++) {
            System.out.print(charArray);
        }
        return;
    }
}
