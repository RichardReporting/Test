package tasks07.task0708;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> alist = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            alist.add(s.nextLine());
        }
        int maxLng = 0;
        for (int i = 0; i < alist.size(); i++) {
            if (alist.get(i).length() > maxLng) {
                maxLng = alist.get(i).length();
            }
        }
        for (int i = 0; i < alist.size(); i++) {
            if (alist.get(i).length() == maxLng) {
                System.out.println(alist.get(i));
            }
        }
    }
}
