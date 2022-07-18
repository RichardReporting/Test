package tasks08.task0830;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> alist = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            alist.add(s.nextLine());
        }
        Collections.sort(alist);
        for (int i = 0; i < 20; i++){
            System.out.println(alist.get(i));
        }
    }
}
