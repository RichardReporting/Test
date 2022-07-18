package tasks08.task0819;

import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) {
        HashSet<Cat> catSet = new HashSet<>();
        Cat cat = new Cat();
        catSet = createCats(cat);
        catSet.remove(cat);
        printCats(catSet);
    }

    public static HashSet<Cat> createCats(Cat cat) {
        HashSet<Cat> catSet = new HashSet<>();
        catSet.add(cat);
        for (int i = 0; i < 2; i++) {
            Cat cat1 = new Cat();
            catSet.add(cat1);
        }
        return catSet;
    }

    public static void printCats(HashSet<Cat> catSet) {
        Iterator it = catSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static class Cat {
        public static void Cat() {

        }
    }


}
