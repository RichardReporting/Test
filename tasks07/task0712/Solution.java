package tasks07.task0712;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> alist = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            alist.add(s.nextLine());
        }
        int minLng = alist.get(0).length();
        int maxLng = 0;
        for (int i = 0; i < alist.size(); i++) {
            if (alist.get(i).length() < minLng) {
                minLng = alist.get(i).length();
                maxLng = alist.get(i).length();
            }
        }

        for (int i = 0; i < alist.size(); i++) {
            if (alist.get(i).length() == minLng) {
                System.out.println(alist.get(i));
                maxLng = minLng-1;
            }
            if (alist.get(i).length() == maxLng) {
                System.out.println(alist.get(i));
                minLng = maxLng+1;
            }
        }

    }
}
