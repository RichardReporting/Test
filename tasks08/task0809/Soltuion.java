package tasks08.task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Soltuion {

    public static void main(String[] args) {
        System.out.println(listTimeCounter(new ArrayList()));
        System.out.println(listTimeCounter(new LinkedList()));

    }

    public static long listTimeCounter(List list) {
        long timerStart = new Date().getTime();
        tenThousandsOfTheLists(list);
        return (new Date().getTime() - timerStart);
    }

    public static void tenThousandsOfTheLists(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
        return;
    }

}


