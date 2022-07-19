package tasks09.task0930;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int aSize = 8;
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Boolean> checkList = new ArrayList<>();

        for (int i = 0; i < aSize; i++) {
            int n = 0;
            try {
                n = s.nextInt();
                intList.add(n);
                checkList.add(true);

            } catch (Exception e) {
                stringList.add(s.nextLine());
                checkList.add(false);
            }
        }

        Collections.sort(intList);
        Collections.reverse(intList);
        Collections.sort(stringList);
        int j = 0;
        int k = 0;
        for (int i = 0; i < aSize; i++) {

            if (checkList.get(i)) {
                System.out.println(intList.get(j));
                j++;
            } else {
                System.out.println(stringList.get(k));
                k++;
            }
        }
    }
}
