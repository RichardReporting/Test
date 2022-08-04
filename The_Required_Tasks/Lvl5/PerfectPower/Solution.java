package The_Required_Tasks.Lvl5.PerfectPower;

public class Solution {
    public static void main(String[] args) {

    }

    public static int[] perfectPower(int n) {
        int nBuff = n;
        int j = 0;
        for (int i = 2; i * i <= n; i++) {
            while ((nBuff % i == 0) && (nBuff > 1)) {
                nBuff = nBuff / i;
                j++;
            }
            if (nBuff == 1) {
                return new int[]{i, j};
            }
            nBuff = n;
            j = 0;
        }
        return null;
    }
}
