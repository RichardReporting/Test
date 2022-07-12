package tasks05.task0517;

import java.util.Scanner;

class Cat {
    String name;
    int weight;
    int age;
    String color;
    String address;

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        this.address = address;
    }

    public Cat(String name) {
        this.name = name;
        this.weight = 2;
        this.age = 5;
        this.address = null;
        this.color = "common";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.address = null;
        this.color = "common";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.weight = 3;
        this.age = age;
        this.address = null;
        this.color = "common";
    }

    public Cat(int weight, String color) {
        this.name = null;
        this.age = 3;
        this.weight = weight;
        this.address = null;
        this.color = color;
    }

    public Cat(int weight, String color, String address){
        this.name = null;
        this.age = 3;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int age = s.nextInt();
        int weight = s.nextInt();
        s.nextLine();
        String address = s.nextLine();
        String color = s.nextLine();

        Cat cat1 = new Cat(name);
        Cat cat2 = new Cat(name, weight, age);
        Cat cat3 = new Cat(name, age);
        Cat cat4 = new Cat(weight, color);
        Cat cat5 = new Cat(weight, color, address);

        System.out.println(cat1.name + " " + cat1.weight + " " + cat1.age + " " + cat1.color + " " + cat1.address);
        System.out.println(cat2.name + " " + cat2.weight + " " + cat2.age + " " + cat2.color + " " + cat2.address);
        System.out.println(cat3.name + " " + cat3.weight + " " + cat3.age + " " + cat3.color + " " + cat3.address);
        System.out.println(cat4.name + " " + cat4.weight + " " + cat4.age + " " + cat4.color + " " + cat4.address);
        System.out.print(cat5.name + " " + cat5.weight + " " + cat5.age + " " + cat5.color + " " + cat5.address);
    }
}
