package tasks04.task0415;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(ifTriangle(a,b,c));
    }
    public static String ifTriangle(int a, int b, int c){
        if ((a + b < c)|(a + c < b) | (b + c < a)){
            return ("Треугольник не существует");
        }
        return ("Треугольник существует");
    }
}
