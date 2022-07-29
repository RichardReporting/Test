package The_Required_Tasks.Lvl6.PlayingWithDigits;

public class Solution {
    public static void main(String[] args) {
        System.out.println(digitsPlayer(46288, 3));
    }

    public static Integer digitsPlayer(int n, int p) {
        final int nBackup = n;
        int nReverse = 0;
        while (n > 0) {
            nReverse *= 10;
            nReverse += n % 10;
            n /= 10;
        }
        int sum = 0;
        n = nReverse;
        while (n > 0) {
            sum += (int) Math.pow(n % 10, p);
            n /= 10;
            p++;
        }
        n = nBackup;
        if (sum % n == 0) return sum / n;
        return -1;
    }
}
