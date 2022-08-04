package The_Required_Tasks.Lvl5.Scramblies;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(scramble("scriptjavx", "javascript"));
    }

    public static boolean scramble(String str1, String str2) {
        HashMap<Character, Integer> mapOfChars = new HashMap<>();
        char[] charOfStr1 = str1.toCharArray();
        for (int i = 0; i < str1.length(); i++) {
            if (mapOfChars.containsKey(charOfStr1[i])) {
                mapOfChars.put(charOfStr1[i], mapOfChars.get(charOfStr1[i]) + 1);
            } else {
                mapOfChars.put(charOfStr1[i], 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if ((mapOfChars.containsKey(str2.charAt(i))) && (mapOfChars.get(str2.charAt(i)) > 0)) {
                mapOfChars.put(str2.charAt(i), mapOfChars.get(str2.charAt(i)) - 1);
            } else {
                return false;
            }

        }
        return true;
    }
}
