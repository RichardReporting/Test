package tasks03.task0312;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        System.out.println(convertToSeconds(6));
        System.out.println(convertToSeconds(5));

    }
    public static int convertToSeconds(int hour){

        return(hour*3600);
    }
}