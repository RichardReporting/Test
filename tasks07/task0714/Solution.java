package tasks07.task0714;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> alist = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            alist.add(s.nextLine());
        }
        alist.remove(2);

        for (int i = alist.size()-1; i >= 0; i--) {
            System.out.println(alist.get(i));
        }
    }
}
