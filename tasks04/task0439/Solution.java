package tasks04.task0439;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        sayMyName(str);
    }

    public static void sayMyName(String str) {
        for (int i = 0; i < 10; i++) {
            System.out.println(str + " любит меня");
        }
    }
}
