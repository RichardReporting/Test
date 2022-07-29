package The_Required_Tasks.Lvl6.YourOrderPlease;

public class Solution {
    public static void main(String[] args) {
        System.out.println(inOrder("4of Fo1r pe6ople g3ood th5e the2"));
    }

    public static String inOrder(String words) {
        if (words == "") {
            return "";
        }
        String[] splitWords = words.split(" ");
        int constSize = splitWords.length;
        int[] indexes = new int[10];
        for (int i = 0; i < constSize; i++) {
            int j = Integer.parseInt(splitWords[i].replaceAll("\\D", "")) - 1;  //replaced 2nd for
            indexes[j] = i;
        }
        words = "";
        for (int i = 0; i < constSize; i++) {
            words += String.join(" ", splitWords[indexes[i]]) + " ";
        }
        return words.substring(0, words.length() - 1);
    }
}
  /*for (int j = 1; j < 10; j++) {
                  if (splitWords[i].contains(String.valueOf(j))) {
                    indexes[j-1] = i;
                    break;
                }
           }*/