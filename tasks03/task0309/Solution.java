package tasks03.task0309;

public class Solution {
    public static void main(String[] args){

        from1Plus10();

        }

    public static void from1Plus10(){
        int a = 1;
        for (int i = 2; i <= 11 ; i++) {
            System.out.print(a + "\n");
            a += i;
        }
    }
}
