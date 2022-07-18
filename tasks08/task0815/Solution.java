package tasks08.task0815;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("Иванов","Петр");
        map.put("Петров","Петр");
        map.put("Сергеев","Иван");
        map.put("Курочкин","Сергей");
        map.put("Смирнов","Иван");
        map.put("Сидоров","Петр");
        map.put("Васильков","Евгений");
        map.put("Темнов","Иван");
        map.put("Смит","Джон");
        map.put("Оруэлл","Джордж");

        int ivanCount = 0;
        for (String key : map.keySet()){
            String value = map.get(key);
            if (value == "Иван") ivanCount ++;
        }
        System.out.print(ivanCount);
    }
}
