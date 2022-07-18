package tasks09.task0908;

public class Solution {
    public static void main(String[] args) {

        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException m) {
            System.out.print("NullPointerException");
        }
    }
}
