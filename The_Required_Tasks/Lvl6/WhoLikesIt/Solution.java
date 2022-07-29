package The_Required_Tasks.Lvl6.WhoLikesIt;

public class Solution {
    public static void main(String[] args) {
        String[] str = {"a","b"};
        whoLikesIt(str);
    }

    public static String whoLikesIt(String[] arrayOfLikes) {
        int amountOfLikes = arrayOfLikes.length;
        String outString = "";
        switch (amountOfLikes) {
            case 0:
                outString = "no one likes this";
                break;
            case 1:
                outString = arrayOfLikes[0] + " likes this";
                break;
            case 2:
                outString = arrayOfLikes[0] + " and " + arrayOfLikes[1] + " like this";
                break;
            case 3:
                outString = arrayOfLikes[0] + ", " + arrayOfLikes[1] + " and " + arrayOfLikes[2] + " like this";
                break;
            default:
                outString = arrayOfLikes[0] + ", " + arrayOfLikes[1] + " and " + (amountOfLikes - 2) + " others liked this";
        }
        System.out.println(outString);
        return outString;
    }
}
