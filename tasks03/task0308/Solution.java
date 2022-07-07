package tasks03.task0308;

public class Solution {
    public static void main(String[] args) {
        from1To10();
    }


    public static long from1To10() {
        int cnt = 1;
        for (int i = 1; i <= 10; i++) {
            cnt *= i;
        }
        System.out.print(cnt);
        return (cnt);
    }
}
