package tasks10.task1003;

public class Solution {
    public static void main(String[] args) {
        float f = (float)128.50;
        int i = (int)f;
        int b = (int)(i + (byte)f);
        System.out.print(b);
    }
}
