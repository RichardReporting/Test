package tasks08.task0810;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


public class Solution {

    public static void main(String[] args) {
        System.out.println(getTimeMsOfGet(new ArrayList()));
        System.out.println(getTimeMsOfGet(new LinkedList()));
    }

    public static long getTimeMsOfGet(List list) {
        list.add(0);
        long timerStart = new Date().getTime();
        tenThousandsOfTheLists(list);
        return (new Date().getTime() - timerStart);
    }

    public static void tenThousandsOfTheLists(List list) {
        for (int i = 0; i < 10000; i++) {
            list.get(0);
        }
        return;
    }

}


