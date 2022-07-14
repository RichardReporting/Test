package tasks07.task0718;

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
        ifArrayIsSorted(alist);
    }

    public static void ifArrayIsSorted(ArrayList<String> alist) {
        int alength = -1;
        for (int i = 0; i < alist.size(); i++) {
            String str = alist.get(i);
            if (str.length() < alength) {
                System.out.print(i);
                return;
            }
            alength = str.length();
        }

    }
}
