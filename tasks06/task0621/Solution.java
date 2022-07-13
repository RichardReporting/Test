package tasks06.task0621;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        /*
        cats[0] = new Cat("дедушка Вася");
        cats[1] = new Cat("бабушка Мурка");
        cats[2] = new Cat("папа Котофей", "дедушка Вася", 'm');
        cats[3] = new Cat("мама Василиса", "бабушка Мурка", 'f');
        cats[4] = new Cat("сын Мурчик", "папа Котофей", "мама Василиса");
        cats[5] = new Cat("дочь Пушинка", "папа Котофей", "мама Василиса");
        */

        Scanner s = new Scanner(System.in);
        Cat cats[] = new Cat[6];
        for (int i = 0; i < 6; i++) {
            cats[i] = new Cat(s.nextLine());
        }

        cats[2] = new Cat(cats[2].name, cats[0].name, 'm');
        cats[3] = new Cat(cats[3].name, cats[1].name, 'f');
        cats[4] = new Cat(cats[4].name, cats[2].name, cats[3].name);
        cats[5] = new Cat(cats[5].name, cats[2].name, cats[3].name);


        for (int i = 0; i < 6; i++) {
            System.out.print("Cat name is " + cats[i].name);
            if (cats[i].mom != null) System.out.print(" mother is " + cats[i].mom);
            else System.out.print(" no mother");
            System.out.print(",");
            if (cats[i].dad != null) System.out.print(" father is " + cats[i].dad);
            else System.out.print(" no father");
            System.out.println("");
        }

    }
}

class Cat {
    String name;
    String dad;
    String mom;

    public Cat(String name, String dad, String mom) {
        this.name = name;
        this.dad = dad;
        this.mom = mom;
    }

    public Cat(String name, String parent, char sex) {
        this.name = name;
        if (sex == 'm') {
            this.dad = parent;
            this.mom = null;
        } else {
            this.dad = null;
            this.mom = parent;
        }

    }

    public Cat(String name) {
        this.name = name;
        this.dad = null;
        this.mom = null;
    }

}
