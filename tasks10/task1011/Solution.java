package tasks10.task1011;

public class Solution {
    public static void main(String[] args) {
        String str = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] chr = str.toCharArray();
        for (int i = 0; i < 40; i++) {
            for (int j = i; j < str.length(); j++) {
                System.out.print(chr[j]);
            }
            System.out.println();
        }
    }
}
