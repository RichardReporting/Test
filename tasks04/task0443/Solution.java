package tasks04.task0443;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int y = s.nextInt();
        int m = s.nextInt();
        int d = s.nextInt();
        theNameIsAName(name, y, m, d);
    }

    public static void theNameIsAName(String name, int y, int m, int d) {
        System.out.println("Меня зовут " + name + ".\nЯ родился " + d + "." + m + "." + y);
        return;
    }
}
