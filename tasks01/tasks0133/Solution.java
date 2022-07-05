package tasks01.tasks0133;

import java.util.Scanner;

public class Solution {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

    }
    public static  int getCountSecondsPassedInCurrentHour(int seconds){
        return(seconds%3600);
    }
}
