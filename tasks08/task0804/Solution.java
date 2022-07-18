package tasks08.task0804;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        HashMap<String, String> hMap = new HashMap<>();

        hMap.put("арбуз", "ягода");
        hMap.put("банан", "трава");
        hMap.put("вишня", "ягода");
        hMap.put("груша", "фрукт");
        hMap.put("дыня", "овощ");
        hMap.put("ежевика", "куст");
        hMap.put("жень-шень", "корень");
        hMap.put("земляника", "ягода");
        hMap.put("ирис", "цветок");
        hMap.put("картофель", "клубень");

        //
        for (String key : hMap.keySet()) {
            System.out.println(key);
        }
    }

}
