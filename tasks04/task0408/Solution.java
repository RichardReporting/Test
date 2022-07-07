package tasks04.task0408;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(compare(n));
    }
    public static String compare(int n){
        if (n < 5 ) return ("Число меньше 5");
        if (n == 5 ) return ("Число равно 5");
        else return("Число больше 5");
    }
}
