package tasks05.task0515;

import java.util.Scanner;

class Person {
    String name;
    char sex;
    int money;
    int weight;
    double size;

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex() {
        this.sex = sex;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney() {
        this.money = money;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize() {
        this.size = size;

    }

    public Person(String name, int money, char sex, int weight, double size) {
        this.name = name;
        this.money = money;
        this.sex = sex;
        this.weight = weight;
        this.size = size;
    }


}

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int money = s.nextInt();
        char sex = s.next().charAt(0);
        int weight = s.nextInt();
        double size = s.nextDouble();

        Person person = new Person(name, money, sex, weight, size);
        System.out.print(person.name + " " + person.money + " " + person.sex + " " + person.weight + " " + person.weight + " " + person.size);
    }
}
