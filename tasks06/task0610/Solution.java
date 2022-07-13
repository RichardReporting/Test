package tasks06.task0610;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String str = ConsoleReader.readString();
        int n = ConsoleReader.readInt();
        double a = ConsoleReader.readDouble();
        boolean b = ConsoleReader.readBoolean();
        System.out.println(str + "\n" + n + "\n" + a + "\n" + b);
    }
}

class ConsoleReader {
    public static String readString() {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        return (str);
    }

    public static int readInt() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        return (n);
    }

    public static double readDouble() {
        Scanner s = new Scanner(System.in);
        double num = s.nextDouble();
        return (num);
    }

    public static boolean readBoolean() {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if ("true".equals(str)) return (true);
        return (false);
    }
}