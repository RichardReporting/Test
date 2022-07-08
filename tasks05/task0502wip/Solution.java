package tasks05.task0502wip;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    static ArrayList<Cat> cats = new ArrayList<Cat>();

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        newCat(cat1);
        Cat cat2 = new Cat();
        newCat(cat2);
        fightCat(cat1, cat2);
    }

    public static int powerCounter(Cat cat) {
        int fightPwr1 = cat.weight;
        if ((cat.age > 2) && (cat.age < 9)) fightPwr1 *= 2;
        switch (cat.strength) {
            case "Чонкер":
                fightPwr1 *= 2;
            case "Котъ":
                fightPwr1 *= 1.5;
            case "Бродяга":
                fightPwr1 *= 0.5;

        }
        return (fightPwr1);
    }

    public static void fightCat(Cat cat1, Cat cat2) {
        int pwr1 = powerCounter(cat1);
        int pwr2 = powerCounter(cat2);
        if (pwr1 > pwr2) {
            System.out.println(cat1.name + " сильнее, чем " + cat2.name);
            return;
        }
        if (pwr1 < pwr2){
            System.out.println(cat2.name + " сильнее, чем "+ cat1.name);
            return;
        }
        System.out.println("Оба бойца одинаково сильны");
        return;
    }

    public static void newCat(Cat cat) {
        Scanner s = new Scanner(System.in);
        cat.name = s.nextLine();
        cat.age = s.nextInt();
        s.nextLine();
        cat.weight = s.nextInt();
        s.nextLine();
        cat.strength = s.nextLine();
        cats.add(cat);
    }

    static class Cat {
        String name;
        int age;
        int weight;
        String strength;
    }

}
