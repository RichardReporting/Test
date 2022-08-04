package The_Required_Tasks.Lvl5.ValidParentheses;

public class Solution {
    public static void main(String[] args) {
        System.out.println(validator("(()))("));
    }

    public static boolean validator(String strText) {
        char[] charArrText = strText.toCharArray();
        int intValidator = 0;
        for (int i = 0; i < strText.length(); i++) {
            if (charArrText[i] == '(') intValidator++;
            if (charArrText[i] == ')') intValidator--;
            if (intValidator < 0) return false;
        }
        return (intValidator == 0);
    }
}
