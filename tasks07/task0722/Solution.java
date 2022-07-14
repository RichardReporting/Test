package tasks07.task0722;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> alist = new ArrayList<>();
        String checker = s.nextLine();
        while (!checker.equals("end")) {
            alist.add(checker);
            checker = s.nextLine();
        }
        for (String str : alist) {
            System.out.println(str);
        }
    }
}
