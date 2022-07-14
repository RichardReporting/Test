package tasks07.task0713;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> alist = new ArrayList<>();
        ArrayList<Integer> a2list = new ArrayList<>();
        ArrayList<Integer> a3list = new ArrayList<>();
        ArrayList<Integer> anywaylist = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            alist.add(s.nextInt());
        }
        for (int i = 0; i < 20; i++) {
            int chk = 0;
            if (alist.get(i) % 2 == 0) {
                chk = 1;
                a2list.add(alist.get(i));
            }
            if (alist.get(i) % 3 == 0) {
                chk = 1;
                a3list.add(alist.get(i));
            }
            if (chk == 0) anywaylist.add(alist.get(i));
        }
        printList(a3list);
        printList(a2list);
        printList(anywaylist);
    }

    public static void printList(ArrayList list) {
        for (Object num : list) {
            System.out.println(num);
        }
    }
}


