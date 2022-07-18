package tasks09.task0903;

public class Solution {
    public static void main(String[] args) {
        firstMethod();
    }

    public static Integer firstMethod() {
        StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
        secondMethod();
        return  sTE[1].getLineNumber();
    }

    public static Integer secondMethod() {
        StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
        thirdMethod();
        return sTE[1].getLineNumber();
    }

    public static Integer thirdMethod() {
        StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
        fourthMethod();
        return sTE[1].getLineNumber();
    }

    public static Integer fourthMethod() {
        StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
        fifthMethod();
        return sTE[1].getLineNumber();
    }

    public static Integer fifthMethod() {
        StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
        return sTE[1].getLineNumber();
    }
}
