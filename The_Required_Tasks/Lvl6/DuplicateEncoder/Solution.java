package The_Required_Tasks.Lvl6.DuplicateEncoder;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
       // System.out.println(duplicateEncoder("abbbbbobbeb"));
    }

    public static String duplicateEncoder(String str) {
        HashMap<Character, Integer> mapOfDup = new HashMap<>();
        char[] charArray = str.toLowerCase().toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (mapOfDup.containsKey(charArray[i])) mapOfDup.put(charArray[i], mapOfDup.get(charArray[i]) + 1);
            else mapOfDup.put(charArray[i], 1);
        }

        for (int i = 0; i < charArray.length; i++) {
            if (mapOfDup.get(charArray[i]) > 1) charArray[i] = '(';
            else charArray[i] = ')';
        }

        str = String.valueOf(charArray);
        return str;
    }
}

