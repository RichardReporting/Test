package tasks07.task0717;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> alist = new ArrayList<>();
        int n = 5;
        for (int i = 0; i < n; i++) {
            alist.add(s.nextLine());
        }
        doubleArrayList(alist);
    }

    public static void doubleArrayList(ArrayList<String> alist) {
        int alistSize = alist.size() * 2;
        for (int i = 0; i < alistSize; i += 2) {
            String alistGet = alist.get(i);
            alist.add(i, alistGet);
        }
        for (int i = 0; i < alistSize; i++) {
            System.out.println(alist.get(i));
        }
    }
}
