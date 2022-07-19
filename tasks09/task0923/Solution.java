package tasks09.task0923;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution inputSol = new Solution();
        String input = "Мама Мыла Раму.";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        //
        Scanner s = new Scanner(System.in);
        //
        String str = s.nextLine();
        printOfVowelsNTheRest(str);
    }

    public static void printOfVowelsNTheRest(String str) {
        StringBuilder stringOfVowels = new StringBuilder();
        StringBuilder stringOfTheRest = new StringBuilder();
        char[] chars = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            char charBuffer = Character.toLowerCase(chars[i]);
            if ((charBuffer == 'у') || (charBuffer == 'е') || (charBuffer == 'а') || (charBuffer == 'ы') ||
                    (charBuffer == 'о') || (charBuffer == 'э') || (charBuffer == 'я') ||
                    (charBuffer == 'и') || (charBuffer == 'ю')) {
                stringOfVowels.append(chars[i] + " ");
            } else if (charBuffer != ' ')
                stringOfTheRest.append(chars[i] + " ");

        }
        System.out.print(stringOfVowels + "\n" + stringOfTheRest);

    }

    /*
        for (int i = 0; i < str.length(); i++){
            if (chars[i] == ' ') chars[i+1] = toUpperCase(chars[i+1]);
        }
        str = new String(chars);
        System.out.print(str);*/

}
