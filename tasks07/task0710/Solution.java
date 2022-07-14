package tasks07.task0710;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> alist = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            alist.add(0, s.nextLine());
        }
        for (String str : alist) {
            System.out.println(str);
        }
    }
}
