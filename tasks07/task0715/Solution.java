package tasks07.task0715;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();
            alist.add("мама");
            alist.add("мыла");
            alist.add("раму");
        alist.add(2,"именно");
        alist.add(1,"именно");
        alist.add(0,"именно");
        for (String num : alist){
            System.out.println(num);
        }
    }
}
