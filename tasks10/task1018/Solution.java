package tasks10.task1018;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution inputSol = new Solution();
        String input = "1\na\n2\nb\n3\nc\n4\nd\n5\ne\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        //
        Scanner s = new Scanner(System.in);
        HashMap<Integer, String> hashMapDemo = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            int n = s.nextInt();
            s.nextLine();
            String str = s.nextLine();
            hashMapDemo.put(n, str);
        }

        for (Map.Entry<Integer, String> entry : hashMapDemo.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
