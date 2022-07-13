package tasks06.task0614;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            Cat.cats.add(cat);
        }
        Cat.printCats();
    }
}

class Cat {
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public static void Cat() {
    }

    public static void printCats() {
        for (int i = 0; i < cats.size(); i++) {
            int j = cats.size() - i - 1;
            System.out.println(cats.get(j));
        }
    }
}