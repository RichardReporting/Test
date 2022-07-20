package tasks10.task1019;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<Integer, String> hashMapUnique = new HashMap<>();
        while (true){
            String str = s.nextLine();
            if (str.equals("")) break;
            int n = Integer.parseInt(str);
            str = s.nextLine();
            if (str.equals("")) break;
            hashMapUnique.put(n, str);
        }

        for (Map.Entry<Integer, String> entry : hashMapUnique.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
