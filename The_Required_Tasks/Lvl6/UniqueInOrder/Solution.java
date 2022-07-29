package The_Required_Tasks.Lvl6.UniqueInOrder;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        System.out.println(uniqueInOrder("AAABCDEEfFGhKlOL"));
    }

    public static ArrayList<Character> uniqueInOrder (String sequence){
        ArrayList<Character> listOfChar = new ArrayList<>();
        char[] sequenceChar = sequence.toCharArray();
        for (int i = 1; i < sequence.length(); i++){
            if (sequenceChar[i] !=sequenceChar[i-1]) listOfChar.add(sequenceChar[i]);
        }
        return listOfChar;
    }
}
