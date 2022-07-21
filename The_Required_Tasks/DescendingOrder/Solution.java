package The_Required_Tasks.DescendingOrder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        n = sortOfInts(n);
        System.out.print(n);
    }

    public static int sortOfInts(int n) {
        ArrayList<Integer> listForSort = new ArrayList<>();
        while (n > 0) {
            listForSort.add(n % 10);
            n = n / 10;
        }
        listForSort.sort(Comparator.reverseOrder());
        for (int m : listForSort) {
            n *= 10;
            n += m;
        }
        return n;
    }
}
