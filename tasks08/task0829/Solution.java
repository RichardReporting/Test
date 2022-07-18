package tasks08.task0829;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, String> adressMap = new HashMap<>();

        for (int i = 0; i < 3; i ++){
            String address = s.nextLine();
            String name = s.nextLine();
            adressMap.put(address, name);
        }

        String str = s.nextLine();

        System.out.print(adressMap.get(str));

    }

}
