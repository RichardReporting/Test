package tasks04.task0436;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

    }
    public static void the8Block(int n, int m){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
