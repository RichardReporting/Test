package tasks08.task0822;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> alist = getIntegerList(n, s);
        getMinimum(alist);
    }

    public static ArrayList<Integer> getIntegerList(int n, Scanner s) {
        ArrayList<Integer> alist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            alist.add(s.nextInt());
        }
        return alist;
    }

    public static void getMinimum(ArrayList<Integer> alist) {
        int amin = alist.get(0);
        for (int i = 1; i < alist.size(); i++) {
            amin = Math.min(alist.get(i), amin);
        }
        System.out.print(amin);
    }
}
