package The_Required_Tasks.Lvl5.Int32ToIPv4;

public class Solution {
    public static void main(String[] args) {
        converter(234982);
    }

    public static String converter(long longInt32) {
        String stringInt32 = Long.toBinaryString(longInt32);
        System.out.println(stringInt32.length());
        int forSize = 32 - stringInt32.length();
        for (int i = 0; i < forSize; i++) {
            stringInt32 = "0" + stringInt32;
        }

        String stringIPv4 = "";

        for (int i = 0; i < 4; i++) {
            stringIPv4 = stringIPv4 + Integer.parseInt(stringInt32.substring(0, 8), 2) + ".";
            stringInt32 = stringInt32.substring(8);
        }
        return stringIPv4.substring(0,stringIPv4.length()-1);
    }
}
