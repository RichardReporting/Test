package The_Required_Tasks.Lvl7.JadenCasingStrings;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        //String str = "a very small text is written here right now.";
        str = stringConverter(str);
        System.out.print(str);
    }

    public static String stringConverter(String str) {
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);
        for (int i = 1; i < charArray.length; i++){
            if (charArray[i-1] == ' ') charArray[i] = Character.toUpperCase(charArray[i]);
        }
        str = new String(charArray);
        return str;
    }
}
