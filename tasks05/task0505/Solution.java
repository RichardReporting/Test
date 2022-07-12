package tasks05.task0505;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    static ArrayList<Cat> cats = new ArrayList<Cat>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cat cat1 = new Cat();
        newCat(cat1, s);
        Cat cat2 = new Cat();
        newCat(cat2, s);
        Cat cat3 = new Cat();
        newCat(cat3, s);
        if (fightCat(cat1, cat2)) System.out.println(cat1.name + " победил " + cat2.name);
        else System.out.println(cat2.name + " победил " + cat1.name);
        if (fightCat(cat1, cat3)) System.out.println(cat1.name + " победил " + cat3.name);
        else System.out.println(cat3.name + " победил " + cat1.name);
        if (fightCat(cat2, cat3)) System.out.print(cat2.name + " победил " + cat3.name);
        else System.out.print(cat3.name + " победил " + cat2.name);

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

    public static boolean fightCat(Cat cat1, Cat cat2) {
        int pwr1 = powerCounter(cat1);
        int pwr2 = powerCounter(cat2);
        if (pwr1 > pwr2) return (true);
        return (false);
    }

    public static void newCat(Cat cat, Scanner s) {

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
