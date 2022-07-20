package tasks10.task1015;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String>[] arrayOfArrayListOfString1 = new ArrayList[5];

        for (int i = 0; i < 5; i++) {
            ArrayList<String> smallArrayList = new ArrayList<>();
            smallArrayList.add("a" + i);
            smallArrayList.add("b" + i);
            smallArrayList.add("c" + i);
            smallArrayList.add("d" + i);
            arrayOfArrayListOfString1[i] = smallArrayList;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(arrayOfArrayListOfString1[i].get(j) + " ");
            System.out.println();
        }

    }
}
