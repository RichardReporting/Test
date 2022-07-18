package tasks08.task0808;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList();
        ArrayList aList = new ArrayList<>();

        for (long i = 0; i < 10000; i++) {
            lList.add("a" + i);
            aList.add("b" + i);
            lList.get(0);
            aList.get(0);
            lList.set(0, "b"+i);
            aList.set(0, "a"+i);
            lList.remove(0);
            aList.remove(0);
        }
    }
}
