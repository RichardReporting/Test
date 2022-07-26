package The_Required_Tasks.Lvl7.BeginnerSeries3;

import static java.lang.Math.*;

public class Solution {
    public static void main(String[] args) {
    }

    public static Integer sumFromAtoB(int a, int b) {
        int sum = 0;
        int c = max(a, b);
        a = min(a, b);
        b = c;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
}
