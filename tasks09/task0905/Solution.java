package tasks09.task0905;

public class Solution {
    public static void main(String[] args) {
        theDepthOfTheTrace();
    }

    public static Integer theDepthOfTheTrace() {
        StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
        System.out.print(sTE.length);
        return sTE.length;
    }
}
