package The_Required_Tasks.Lvl5.NotVerySecure;

public class Solution {
    public static void main(String[] args) {
        alphanumeric("aboboabeDjSFSDFE4324234////0./.,-");
    }

    public static boolean alphanumeric(String strText) {
        if (strText.length() == 0){
            return false;
        }
        strText = strText.replaceAll("[a-zA-Z\\d]", "");
        return strText.length()==0;
    }
}
