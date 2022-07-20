package tasks10.task1013;

public class Solution {
}

class Human {
    String name;
    int age;
    int weight;
    double height;
    boolean sex;
    short car;

    Human() {

    }

    Human(String name) {
        this.name = name;
    }

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    Human(String name, int age, int weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    Human(int weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    Human(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    Human(String name, boolean sex) {
        this.name = name;
        this.sex = sex;
    }

    Human(boolean sex) {
        this.sex = sex;
    }

    Human(String name, int age, int weight, double height, boolean sex, short car) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
        this.car = car;
    }


}
