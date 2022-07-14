package tasks07.task0719;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> alist = new ArrayList<>();
        int n = 10;
        for (int i = 0; i < n; i++) {
            alist.add(s.nextLine());
        }

        for (int i = alist.size()-1; i >= 0; i--) {
            System.out.println(alist.get(i));

        }
    }

}
