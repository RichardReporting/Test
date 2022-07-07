package tasks04.task0437;

public class Solution {
    public static void main(String[] args) {
        the8Triangle();
    }

    public static void the8Triangle() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
