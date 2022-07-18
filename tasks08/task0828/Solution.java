package tasks08.task0828;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution inputSol = new Solution();
        String input = "May";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        //
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        Map<String,Integer> monthsMap = new HashMap<>();
        monthsMap.put( "January",1);
        monthsMap.put( "February",2);
        monthsMap.put( "March",3);
        monthsMap.put( "April",4);
        monthsMap.put( "May",5);
        monthsMap.put( "June",6);
        monthsMap.put( "July",7);
        monthsMap.put( "August",8);
        monthsMap.put( "September",9);
        monthsMap.put( "October",10);
        monthsMap.put( "November",11);
        monthsMap.put( "December",12);

        System.out.print(str+" is "+monthsMap.get(str)+" month");
    }
}
