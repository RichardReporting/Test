package The_Required_Tasks.Lvl7.ShortestWord;

import static java.lang.Math.*;

public class Solution {
    public static void main(String[] args) {
       // System.out.println(shortestOfThemAll("abeba aboba bobo be"));
    }

    public static Integer findShort(String str) {
        int lengthOfString = 0;
        int minLOS = str.length();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (charArray[i] == ' ') {
               minLOS = min(lengthOfString, minLOS);
                lengthOfString = 0;
            } else lengthOfString++;
        }

        return min (lengthOfString,minLOS);
    }

}
