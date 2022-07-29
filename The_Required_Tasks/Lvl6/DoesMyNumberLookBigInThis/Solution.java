package The_Required_Tasks.Lvl6.DoesMyNumberLookBigInThis;

public class Solution {
    public static void main(String[] args) {
    }

    public static boolean ifNarcissistic(int n) {
        int nSum = 0;
        int nBackup = n;
        int nSize = 0;
        while (n > 0) {
            nSize++;
            n /= 10;
        }
        n = nBackup;
        while (n > 0) {
            nSum += Math.pow((n % 10), nSize);
            n /= 10;
        }
        n = nBackup;
        return n == nSum;
    }
}
