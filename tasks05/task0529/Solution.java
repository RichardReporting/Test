package tasks05.task0529;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int sum = 0;
        while (true) {
            try {
                sum += Integer.parseInt(str);
                str = s.nextLine();
            } catch (NumberFormatException e) {
                break;
            }
        }
        System.out.print(sum);
    }
}
