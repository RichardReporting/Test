package tasks09.task0920;

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--){
            try {
                System.out.println(i);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
