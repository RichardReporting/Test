package The_Required_Tasks.Lvl6.BitCounting;

public class Solution {
    public static void main(String[] args) {
        System.out.println(bitCounter(1234));
    }

    public static Integer bitCounter(int n) {
        int bits = 0;
        while (n > 0) {
            bits += n % 2;
            n /= 2;
        }
        return bits;
    }
}
