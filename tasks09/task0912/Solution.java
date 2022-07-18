package tasks09.task0912;

public class Solution {
    public static void main(String[] args) {

        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException num) {
            System.out.print("NumberFormatException");
        }
    }
}
