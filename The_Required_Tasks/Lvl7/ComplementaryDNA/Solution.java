package The_Required_Tasks.Lvl7.ComplementaryDNA;

public class Solution {
    public static void main(String[] args) {
    }

    public static String dnaDoingThing(String str) {
        str = str.replaceAll("A", "1");
        str = str.replaceAll("T", "A");
        str = str.replaceAll("1", "T");
        //
        str = str.replaceAll("C", "2");
        str = str.replaceAll("G", "C");
        str = str.replaceAll("2", "G");
        return str;
    }
}
