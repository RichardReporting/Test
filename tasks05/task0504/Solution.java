package tasks05.task0504;

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


    public Cat(String name, int weight, int age, String color, String address) {
        this.name = name;
        this.age = 3;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Cat cat1 = catCreator(s);
        Cat cat2 = catCreator(s);
        Cat cat3 = catCreator(s);

        System.out.println(cat1.name + " " + cat1.weight + " " + cat1.age + " " + cat1.color + " " + cat1.address);
        System.out.println(cat2.name + " " + cat2.weight + " " + cat2.age + " " + cat2.color + " " + cat2.address);
        System.out.print(cat3.name + " " + cat3.weight + " " + cat3.age + " " + cat3.color + " " + cat3.address);

    }

    public static Cat catCreator(Scanner s) {
        String name = s.nextLine();
        int age = s.nextInt();
        int weight = s.nextInt();
        s.nextLine();
        String color = s.nextLine();
        String address = s.nextLine();
        Cat cat = new Cat(name, weight,age,color,address);
        return (cat);
    }
}
