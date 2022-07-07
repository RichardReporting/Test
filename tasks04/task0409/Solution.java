package tasks04.task0409;

import java.util.Scanner;

import static java.lang.Math.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(closeToTen(a,b));
    }
    public static int closeToTen(int a, int b){
        if (abs(abs(a)-10)<abs(abs(b)-10)){
            return (a);
        }
        return (b);
    }

}
