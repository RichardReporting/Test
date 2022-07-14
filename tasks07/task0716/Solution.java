package tasks07.task0716;

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
        fix(alist);

    }

    public static void fix(ArrayList<String> alist) {
        int alistSize = alist.size();
        for (int i = 0; i < alistSize; i++) {
            String alistGet = alist.get(i);
            if (!((alistGet.indexOf('л') != -1) && (alistGet.indexOf('р') != -1))) {
                if (alistGet.indexOf('л') != -1) {
                    alist.add(i, alistGet);
                    i++;
                } else {
                    alist.remove(i);
                    i--;
                }
            }
        }
        alistSize = alist.size();
        for (int i = 0; i < alistSize; i++) {
            System.out.println(alist.get(i));
        }


    }
}
