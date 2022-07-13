package tasks06.task0611;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(stringHelper.multiply(str));
        System.out.print(stringHelper.multiply(str, 4));
    }
}

class stringHelper {
    String str;

    public static String multiply(String str, int count) {
        StringBuilder a = new StringBuilder();

        for (int i = 0; i < count; i++) {
            a.append(str);
        }
        return (a.toString());
    }

    public static String multiply(String str) {
        return (multiply(str, 5));
    }

}
