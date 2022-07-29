package The_Required_Tasks.Lvl6.FindTheOddInt;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[] a = {1,2,3,2,3,2,3,2,3,1,2};
        System.out.println(whichIsOdd(a));
    }

    public static Integer whichIsOdd(int[] nArray) {
        HashMap<Integer, Integer> nMap = new HashMap<>();
        for (int i = 0; i < nArray.length; i++) {
            if (nMap.containsKey(nArray[i])) nMap.put(nArray[i], nMap.get(nArray[i]) + 1);
            else nMap.put(nArray[i], 1);
        }
        for (Integer key : nMap.keySet()) {
            Integer value = nMap.get(key);
            if (value % 2 != 0) return key;
        }
        return 0;
    }
}
