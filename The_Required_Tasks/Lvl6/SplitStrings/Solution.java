package The_Required_Tasks.Lvl6.SplitStrings;

public class Solution {
    public static void main(String[] args) {
        String[] str = stringSplitter("abobabibabebe");
        System.out.println(str[0]);
        System.out.println(str[str.length - 1]);
    }

    public static String[] stringSplitter(String strText) {
        if (strText.length() % 2 != 0) strText += '_';
        String[] strArrayText = new String[strText.length() / 2];
        for (int i = 0; i < strArrayText.length; i++) {                 //changed for
            strArrayText[i] = strText.substring(i * 2, 2 + i * 2 );


        }
        return strArrayText;
    }
}

/* int intCount = 0;
            for (int i = 0; i < strArrayText.length; i++) {
            strArrayText[i] = strText.substring(i + intCount, i + 1 + intCount);
            intCount++;
        }*/