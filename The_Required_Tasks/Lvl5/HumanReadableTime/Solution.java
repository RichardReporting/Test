package The_Required_Tasks.Lvl5.HumanReadableTime;

public class Solution {
    public static void main(String[] args) {
        System.out.println(secondCounter(8524));
    }

    public static String secondCounter(int seconds) {
        return (String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60));
    }
}
