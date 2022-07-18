package tasks09.task0906;

public class Solution {
    public static void main(String[] args) {
        log("Message number one");
    }
    public static void log(String message){
        StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
        System.out.print(sTE[1].getClassName()+": "+sTE[2].getMethodName()+": "+ message);
    }
}
