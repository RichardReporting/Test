package tasks07.task0728;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution inputSol = new Solution();
        String input = "4 8 15 16 23 42 7 3 5 5 6 0 8 800 555 3 5 3 5 0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ////
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> alist = new ArrayList<>();
        for (int i = 0; i < 20 ; i++){
            alist.add(s.nextInt());
        }
        for (int i = 19; i >= 0; i--){
            System.out.print(alist.get(i)+" ");
        }

    }
}
