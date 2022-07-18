package tasks09.task0902;

public class Solution {
    public static void main(String[] args) {
        firstMethod();
    }

    public static String firstMethod() {
        StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
        secondMethod();
        return sTE[1].getMethodName();
    }

    public static String secondMethod() {
        StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
        thirdMethod();
        return sTE[1].getMethodName();
    }

    public static String thirdMethod() {
        StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
        fourthMethod();
        return sTE[1].getMethodName();
    }

    public static String fourthMethod() {
        StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
        fifthMethod();
        return sTE[1].getMethodName();
    }

    public static String fifthMethod() {
        StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
        return sTE[1].getMethodName();
    }
}
