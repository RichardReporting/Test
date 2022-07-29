package The_Required_Tasks.Lvl6.DigitalRoot;

public class Solution {
    public static void main(String[] args) {
        System.out.print(sumOfDigits(8554));
    }

    public static Integer sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        while (sum > 9)
            sum = sumOfDigits(sum);
        return sum;
    }
}
