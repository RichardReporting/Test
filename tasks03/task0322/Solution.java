package tasks03.task0322;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name1 = s.next();
        String name2 = s.next();
        String name3 = s.next();
        theTriangleOfLove(name1, name2, name3);

    }

    public static void theTriangleOfLove(String name1, String name2, String name3) {
        System.out.print(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
    }
}
