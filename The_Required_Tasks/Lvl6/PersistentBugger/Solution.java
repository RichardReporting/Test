package The_Required_Tasks.Lvl6.PersistentBugger;

public class Solution {

    public static void main(String[] args) {
       System.out.println(persistence(3));
    }

    public static Integer persistence(int num) {
        int mult = 1;
        int roundCount = 0;
        if (num > 9) {
            roundCount++;
            while (num > 0) {
                mult *= num % 10;
                num /= 10;
            }
        }
        System.out.println(mult);
        if (mult > 9) roundCount += persistence(mult);
        return roundCount;
    }

}
