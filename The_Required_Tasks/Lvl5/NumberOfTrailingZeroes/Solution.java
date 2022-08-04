package The_Required_Tasks.Lvl5.NumberOfTrailingZeroes;

public class Solution {
    public static void main(String[] args) {


    }

    public static long zeroesCounter(int n) {
        long count = 0;

        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }
}