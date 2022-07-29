package The_Required_Tasks.Lvl6.FindTheParityOutler;

public class Solution {
    public static void main(String[] args) {

    }

    public static Integer awolFinder(int[] numArray) {
        int oddChecker = 0;
        for (int i = 0; i < 3; i++) {
            oddChecker += numArray[i] % 2;
        }
        int i = 0;
        if ((oddChecker == 2) || (oddChecker == 3)) {
            while (numArray[i] % 2 == 0) i++;
            return numArray[i];
        } else
            while (numArray[i] % 2 != 0) i++;
        return numArray[i];
    }
}
