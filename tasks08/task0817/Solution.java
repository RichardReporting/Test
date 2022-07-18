package tasks08.task0817;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        HashMap<String, String> hMap = new HashMap<>();
        hMap.put("a1", "b1");
        hMap.put("a2", "b2");
        hMap.put("a3", "b1");
        hMap.put("a4", "b3");
        hMap.put("a5", "b1");
        hMap.put("a6", "b4");
        hMap.put("a7", "b1");
        hMap.put("a8", "b5");
        hMap.put("a9", "b1");
        hMap.put("a10", "b6");

        theFirstNameDupRemover(hMap);

        for (String key : hMap.keySet()) {
            System.out.println(key + " " + hMap.get(key));
        }

    }

    public static void theFirstNameDupRemover(HashMap<String, String> map) {

        List<String> list = new LinkedList<>(map.values());

        for (String s : list) {
            if (Collections.frequency(map.values(), s) > 1) {
                theDuplicatesRemover(map, s);
            }
        }
    }

    public static void theDuplicatesRemover(HashMap<String, String> map, String value) {
        HashMap<String, String> hMCopy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : hMCopy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
