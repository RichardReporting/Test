package tasks10.task1001;

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a*b);
        double f = (double) 1234.15;
        long d = (int) (a + f / c + b);
        System.out.print(d);
    }

}
