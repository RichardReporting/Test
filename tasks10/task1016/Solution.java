package tasks10.task1016;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, Integer> mapOfWords = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            String currentInput = s.nextLine();
            if (mapOfWords.containsKey(currentInput)) mapOfWords.put(currentInput, mapOfWords.get(currentInput) + 1);
            else mapOfWords.put(currentInput, 0);
        }

        for (Map.Entry<String, Integer> entry : mapOfWords.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

