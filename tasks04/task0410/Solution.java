package tasks04.task0410;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

    }
    public static String checkInterval(int n){
        if ((n >=50)& (n<=100)){
            return ("Число "+ n +" содержится в интервале");
        }
        else return ("Число "+ n +" не содержится в интервале");
    }
}
