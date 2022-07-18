package tasks08.task0821;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Петр");
        map.put("Петров", "Петр");
        map.put("Иванов", "Иван");
        map.put("Курочкин", "Сергей");
        map.put("Сидоров", "Иван");
        map.put("Сидоров", "Петр");
        map.put("Васильков", "Евгений");
        map.put("Петров", "Иван");
        map.put("Смит", "Джон");
        map.put("Оруэлл", "Джордж");

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
