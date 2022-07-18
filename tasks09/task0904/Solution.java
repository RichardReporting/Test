package tasks09.task0904;

public class Solution {
    public static void main(String[] args) {
        methodToCall();
    }

    public static void methodToCall() {
        StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
        while (sTE.length<10) methodToCall();
        System.out.println(sTE.length);
        throw new RuntimeException();

    }
}
