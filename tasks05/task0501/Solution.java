package tasks05.task0501;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    static ArrayList<Cat> cats = new ArrayList<Cat>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cat cat1 = new Cat();
        cat1.name = s.nextLine();
        cat1.age = s.nextInt();
        cat1.weight = s.nextInt();
        s.nextLine();
        cat1.strength = s.nextLine();

        cats.add(cat1);

        System.out.print("Кот " + cat1.name + ", ему " + cat1.age + " лет, он весит " + cat1.weight + " и по силе он " + cat1.strength);
    }

    static class Cat {
        String name;
        int age;
        int weight;
        String strength;
    }

}
