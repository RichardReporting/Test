package tasks07.task0724;

public class Solution {
    public static void main(String[] args) {
        Human grandad1 = new Human("Павел", true, 54, null, null);
        Human grandad2 = new Human("Василий", true, 62, null, null);
        Human granmom1 = new Human("Светлана", false, 49, null, null);
        Human granmom2 = new Human("Евгения", false, 56, null, null);
        Human dad = new Human("Сергей", true, 31, grandad1, granmom1);
        Human mom = new Human("Юлия", false, 28, grandad2, granmom2);
        Human child1 = new Human("Семён", true, 10, dad, mom);
        Human child2 = new Human("Мария", false, 10, dad, mom);
        Human child3 = new Human("Дарья", false, 6, dad, mom);

        System.out.print(grandad1 + "" + grandad2 + "" + granmom1 + "" + granmom2 + "" + dad + "" + mom + "" + child1 + "" + child2 + "" + child3);
    }
}

class Human {
    String name;
    boolean sex;
    int age;
    Human father;
    Human mother;

    public Human() {
        return;
    }

    public Human(String name, boolean sex, int age, Human father, Human mother) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public String toString() {

        String sexDefiner;
        if (sex) sexDefiner = "мужской";
        else sexDefiner = "женский";
        String fatherDefiner = "";
        String motherDefiner = "";
        if (father != null) fatherDefiner = (", отец: " + father.name);
        if (mother != null) motherDefiner = (", мать: " + mother.name);
        return ("Имя: " + name + ", пол: " + sexDefiner + fatherDefiner + motherDefiner + ". ");
    }
}
