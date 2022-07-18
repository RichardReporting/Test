package tasks08.task0818;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws ParseException {
        HashMap<String, Integer> hMap = new HashMap<>();

        hMap.put("S1", 600);
        hMap.put("S2", 400);
        hMap.put("S3", 180);
        hMap.put("S4", 6000);
        hMap.put("S5", 260);
        hMap.put("S6", 1600);
        hMap.put("S7", 2800);
        hMap.put("S8", 20);
        hMap.put("S9", 0);
        hMap.put("S10", 90000);

        poorRemover(hMap);
    }

    public static void poorRemover(HashMap<String, Integer> hMap) {
        Iterator<HashMap.Entry<String, Integer>> it = hMap.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            if (entry.getValue()<500) it.remove();
        }
        for (String key: hMap.keySet()) {
            System.out.println(key+" "+ hMap.get(key));
        }


    }
}
