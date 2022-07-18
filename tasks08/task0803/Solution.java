package tasks08.task0803;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        HashMap<String, Cat> hMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat("Cat"+i);
            hMap.put(cat.name, cat);
        }
        for (String key : hMap.keySet()) {
            System.out.println(key + " - " + hMap.get(key));
        }
    }
}

class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }
}