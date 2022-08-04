package The_Required_Tasks.Lvl5.SimplePigLatin;

public class Solution {
    public static void main(String[] args) {
        System.out.println(pigLatinator("aboba is a good meme !"));
    }

    public static String pigLatinator(String strText) {
        String[] strArrayText = strText.split(" ");
        for (int i = 0; i < strArrayText.length; i++) {
            if (strArrayText[i].matches("[a-zA-Z]+")) {
                strArrayText[i] = strArrayText[i].substring(1) + strArrayText[i].charAt(0) + "ay";
            }
        }
        return String.join(" ", strArrayText);
    }
}
