package The_Required_Tasks.Lvl6.CreatePhoneNumber;

public class Solution {
    public static void main(String[] args) {
    }

    public static String wrongNumber(int[] nums) {
        String rightNumber = "(" + nums[0] + nums[1] + nums[2] + ") " +
                +nums[3] + nums[4] + nums[5] + "-" + nums[6] + nums[7] + nums[8] + nums[9];
        return rightNumber;
    }
}
