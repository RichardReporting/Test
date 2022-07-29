package The_Required_Tasks.Lvl6.Tribonacci;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        double[] a = {0,0,1};
        a = meBonacci(a, 10);
        for (int i = 0 ; i < 10; i++){
            System.out.println(a[i]);
        }
    }

    public static double[] meBonacci(double[] s, int n) {
        double[] arrabonacci = Arrays.copyOf(s, n);
        if (n > 3)
            for (int ibonacci = 3; ibonacci < n; ibonacci++) {
                arrabonacci[ibonacci] = arrabonacci[ibonacci - 3] + arrabonacci[ibonacci - 2] + arrabonacci[ibonacci - 1];
            }
        return arrabonacci;
    }
}
