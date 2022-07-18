package tasks08.task0801;

import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) {
        HashSet<String> hSet = new HashSet<>();

        hSet.add("арбуз");
        hSet.add("банан");
        hSet.add("вишня");
        hSet.add("груша");
        hSet.add("дыня");
        hSet.add("ежевика");
        hSet.add("жень-шень");
        hSet.add("земляника");
        hSet.add("ирис");
        hSet.add("картофель");

        Iterator<String> it = hSet.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
    }
}
