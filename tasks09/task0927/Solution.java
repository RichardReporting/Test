package tasks09.task0927;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        HashMap<String, Cat> catMap = new HashMap<String, Cat>();
        HashSet<Cat> catSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat("cat" + i);
            catMap.put(cat.name, cat);
        }
        for (int i = 0; i < 10; i++) {
            catSet.add(catMap.get("cat" + i));
        }
        for (Cat catOut : catSet
        ) {
            System.out.println(catOut);

        }
    }

}

class Cat {
    String name;

    Cat(String name) {
        this.name = name;
    }
}