package The_Required_Tasks.Lvl7.DisemvowelTrolls;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.print(trollDestroyer(str));
    }

    public static String trollDestroyer(String str) {
        str = str.replaceAll("[aoeiuAOEIU]", "");
        return str;

    }
}
