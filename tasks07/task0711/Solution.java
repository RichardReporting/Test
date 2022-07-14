package tasks07.task0711;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> alist = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            alist.add(s.nextLine());
        }
        String theArrayKeeper;
        for (int i = 0; i < 13; i++) {
            theArrayKeeper = alist.get(4);
            alist.remove(4);
            alist.add(0, theArrayKeeper);

        }

        for (String str : alist) {
            System.out.println(str);
        }
    }
}
