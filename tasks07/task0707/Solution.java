package tasks07.task0707;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> alist = new ArrayList<>();
        for (int i = 0; i < 5; i ++){
            alist.add(s.nextLine());
        }
        System.out.println(alist.size());
        for (String num : alist){
            System.out.println(num);
        }
    }
}
