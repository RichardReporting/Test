package The_Required_Tasks.Lvl6.MultiplesOf3Or5;

public class Solution {
    public static void main(String[] args) {
       // System.out.println(sumOf3N5(23));
    }

    public static Integer sumOf3N5(Integer n) {
        if (n <= 3) return 0;
        int sum = 0;
        for (int i = 3; i < n; i++) {
            if (isDivsBy3Or5(i)) sum += i;
        }
        return sum;
    }

    public static boolean isDivsBy3Or5(int n) {
        return ((n % 3 == 0) || (n % 5 == 0));
    }
}
