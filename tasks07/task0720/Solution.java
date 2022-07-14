package tasks07.task0720;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        s.nextLine();
        ArrayList<String> alist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            alist.add(s.nextLine());
        }

        for (int i = 0; i < m; i++) {
            alist.add(alist.get(0));
            alist.remove(0);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(alist.get(i));
        }
    }
}
