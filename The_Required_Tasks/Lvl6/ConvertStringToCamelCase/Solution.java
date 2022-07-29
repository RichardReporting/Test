package The_Required_Tasks.Lvl6.ConvertStringToCamelCase;

public class Solution {
    public static void main(String[] args) {
        System.out.println(camelCapitalist("aboba_is_a-capital-of_great-memes"));
    }

    public static String camelCapitalist(String word) {
        String[] stringOfWords = word.split("-|_");
        for (int i = 1; i < stringOfWords.length; i++) {
            stringOfWords[i] = stringOfWords[i].substring(0, 1).toUpperCase() + stringOfWords[i].substring(1);
        }
        word = String.join("",stringOfWords);
        return word;
    }
}
