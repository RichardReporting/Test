package tasks08.task0823;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class Solution {
    public static void main(String[] args) {
        Solution inputSol = new Solution();
        String input = "мама мыла раму";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        //
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] chars = str.toCharArray();
        chars[0] = toUpperCase(chars[0]);
        for (int i = 0; i < str.length(); i++){
            if (chars[i] == ' ') chars[i+1] = toUpperCase(chars[i+1]);
        }
        str = new String(chars);
        System.out.print(str);
    }
}
