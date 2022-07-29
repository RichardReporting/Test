package The_Required_Tasks.Lvl6.DetectPangram;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(pangramFinder("lazy dog"));
    }
    public static boolean pangramFinder(String strText){
        char[] charArrayText = strText.toLowerCase().toCharArray();
        HashMap<Character, Integer> nMap = new HashMap<>();
        for (int i = 0; i < charArrayText.length; i++) {
            if (Character.isAlphabetic(charArrayText[i])) nMap.put(charArrayText[i], 1);
        }
        return nMap.size() == 26;
    }
}
