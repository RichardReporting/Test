package tasks08.task0813;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> sSet = new HashSet<>();
        for (int i = 0; i < 20; i++){
            sSet.add("Л"+i);
        }
        for (String s: sSet)
        {
            System.out.println(s);
        }

    }
}

