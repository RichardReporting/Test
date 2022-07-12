package tasks05.task0507;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        midOfNum();
    }

    public static void midOfNum() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double sum = 0;
        int cnt = 0;
        while (n != -1) {
            sum += n;
            cnt++;
            n = s.nextInt();
        }
        if (cnt == 0) {
            System.out.print("0");
            return;
        }
        System.out.print(sum / cnt);
    }
}
