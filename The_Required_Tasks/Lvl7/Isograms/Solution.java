package The_Required_Tasks.Lvl7.Isograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String str = "";
        System.out.print(isogramChecker(str));
    }

    public static boolean isogramChecker(String str) {
        String[] str1 = str.toLowerCase().split("");
        List<String> aList = Arrays.asList(str1);
        HashSet<String> hSet = new HashSet<>(aList);
        return hSet.size() == str1.length;
    }
}
