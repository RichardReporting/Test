package tasks10.task1017;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> listOfInts = new ArrayList<>();
        int index = s.nextInt();
        int defaultValue = 0;
        for (int i = 0; i < 20; i++) {
            listOfInts.add(s.nextInt());
        }
        System.out.print(safeGetElement(listOfInts, index, defaultValue));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
        try {
            return (list.get(index));
        } catch (Exception e) {
            return defaultValue;
        }
    }
}
