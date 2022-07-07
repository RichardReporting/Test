package tasks04.task0424;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

    }
    public static int indexOfAnother(int a, int b, int c){
        if (a == b) return (3);
        if (a == c) return (2);
        return (1);
    }
}
