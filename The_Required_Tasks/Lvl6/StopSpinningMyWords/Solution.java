package The_Required_Tasks.Lvl6.StopSpinningMyWords;

public class Solution {
    public static void main(String[] args) {
    }

    public static String theSpinner(String wordString) {
        String[] newString = wordString.split(" ");
        for (int i = 0; i < newString.length; i++) {
            if (newString[i].length() > 4) {
                System.out.println(newString[i]);
                newString[i] = new StringBuilder(newString[i]).reverse().toString();
            }
        }
        wordString = String.join(" ", newString);
        return wordString;
    }
}

