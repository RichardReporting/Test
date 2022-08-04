package The_Required_Tasks.Lvl5.PrimesInNumbers;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {

    }

    public static String factors(int n) {
        HashMap<Integer, Integer> mapOfPrimes = new HashMap<>();
        String strOutput = "";
        for (int i = 2; i < n; i++) {
            int nCount = 0;
            while (n % i == 0) {
                nCount++;
                n /= i;
            }
            if (nCount > 0) {
                mapOfPrimes.put(i, nCount);
            }
        }
        mapOfPrimes.put(n, 1);
        int key = 1;
        for (int i = 1; i < mapOfPrimes.size() + 1; i++) {
            while (!mapOfPrimes.containsKey(key)) {
                key++;
            }
            if (mapOfPrimes.get(key) > 1) {
                strOutput += "(" + String.valueOf(key) + "**" + String.valueOf(mapOfPrimes.get(key)) + ")";
            } else {
                strOutput += "(" + String.valueOf(key) + ")";
            }
            key++;
        }
        return strOutput;
    }
}
