package tasks03.task0312;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int n2 = s.nextInt();

        System.out.println(convertToSeconds(n1));
        System.out.println(convertToSeconds(n2));

    }
    public static int convertToSeconds(int hour){
        return(hour*3600);
    }
}