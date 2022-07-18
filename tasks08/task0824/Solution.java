package tasks08.task0824;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human("Семён", true, 10, null);
        Human child2 = new Human("Мария", false, 10, null);
        Human child3 = new Human("Дарья", false, 6, null);
        ArrayList<Human> secGen = new ArrayList<>();
        secGen.add(child1);
        secGen.add(child2);
        secGen.add(child3);
        Human dad = new Human("Сергей", true, 31, secGen);
        Human mom = new Human("Юлия", false, 28, secGen);
        ArrayList<Human> firstGenDad = new ArrayList<>();
        ArrayList<Human> firstGenMom = new ArrayList<>();
        firstGenDad.add(dad);
        firstGenMom.add(mom);
        Human grandad1 = new Human("Павел", true, 54, firstGenDad);
        Human grandad2 = new Human("Василий", true, 62, firstGenMom);
        Human granmom1 = new Human("Светлана", false, 49, firstGenDad);
        Human granmom2 = new Human("Евгения", false, 56, firstGenMom);


        System.out.print(grandad1 + "" + grandad2 + "" + granmom1 + "" + granmom2 + "" + dad + "" + mom + "" + child1 + "" + child2 + "" + child3);
    }
}

class Human {
    String name;
    boolean sex;
    int age;
    ArrayList<Human> child;

    public Human() {
        return;
    }

    public Human(String name, boolean sex, int age, ArrayList child) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.child = child;
    }

    public String toString() {
        String childDefiner = "";
        if (child != null) {
            childDefiner = (", дети:");
            for (int i = 0; i < child.size(); i++) {
                Human copyOfTheChild = child.get(i);
                childDefiner += (" " + copyOfTheChild.name);
            }
        }
        return ("Имя: " + name + ", пол: " + sex + childDefiner + ". ");
    }
}
