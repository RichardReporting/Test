package The_Required_Tasks.Lvl6.CountingDuplicates;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(duplicatesCounter("Indivisibilities"));
    }

    public static Integer duplicatesCounter(String str) {
        char[] charArray = str.toLowerCase().toCharArray();
        int duplicateSum = 0;
        HashMap<Character, Integer> nMap = new HashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            if (nMap.containsKey(charArray[i])) nMap.put(charArray[i], nMap.get(charArray[i]) + 1);
            else nMap.put(charArray[i], 1);
        }
        for (Character key : nMap.keySet()) {
            Integer value = nMap.get(key);
            if (value > 1) duplicateSum++;
        }
        return duplicateSum;
    }
}
