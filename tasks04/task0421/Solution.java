package tasks04.task0421;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name1 = s.toString();
        String name2 = s.toString();
        System.out.println(equalityOfNames(name1, name2));
    }

    public static String equalityOfNames(String name1, String name2) {
        if (name1.equals(name2)) return ("Имена идиентичны");
        if (name1.length() == name2.length()) return ("Длины имен равны");
        return ("");
    }
}
