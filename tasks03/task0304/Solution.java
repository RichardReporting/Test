package tasks03.task0304;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        System.out.print(incByTenPercent(a));
    }
    public static Double incByTenPercent(double a){
        return (a + a * 0.1);
    }
}
