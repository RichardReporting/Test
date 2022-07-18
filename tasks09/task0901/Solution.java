package tasks09.task0901;

public class Solution {
    public static void main(String[] args) {
        firstMethod();
    }

    public static StackTraceElement[] firstMethod() {
        StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
        secondMethod();
        return sTE;
    }

    public static StackTraceElement[] secondMethod() {
        StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
        thirdMethod();
        return sTE;
    }

    public static StackTraceElement[] thirdMethod() {
        StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
        fourthMethod();
        return sTE;
    }

    public static StackTraceElement[] fourthMethod() {
        StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
        fifthMethod();
        return sTE;
    }

    public static StackTraceElement[] fifthMethod() {
        StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
        return sTE;
    }
}
