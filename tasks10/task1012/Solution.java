package tasks10.task1012;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inputStr = "";
        for (int i = 0; i < 10; i++) {
            inputStr += s.nextLine();
        }
        countAlpha(inputStr);
    }

    public static void countAlpha(String str) {
        str = str.toLowerCase().replaceAll("[^а-я]", "");
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i = 'а'; i <= 'я'; i++) {
            map.put(i, 0);
        }
        for (var element : str.toCharArray()) {
            map.put(element, map.get(element) + 1);
        }
        for (char i = 'а'; i <= 'я'; i++) {
            System.out.println(i + " " + map.get(i));
        }
    }
}
