package The_Required_Tasks.Lvl6.FindTheUniqueNumber;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        double[] a = { 1, 1, 1, 2, 1, 1 };

        System.out.println(uniqueFinder(a));
    }

    public static Double uniqueFinder(double[] dbArrNumbers) {
        HashMap<Double, Integer> nMap = new HashMap<>();
        for (int i = 0; i < dbArrNumbers.length; i++) {
            if (nMap.containsKey(dbArrNumbers[i])) nMap.put(dbArrNumbers[i], nMap.get(dbArrNumbers[i]) + 1);
            else nMap.put(dbArrNumbers[i], 1);
        }
        for (Double key : nMap.keySet()) {
            Integer value = nMap.get(key);
            if (value == 1) return key;
        }
        return 0.0;
    }
}
