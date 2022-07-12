package tasks05.task0527;

import java.util.Scanner;

class Mouse {
    String name;
    int height;
    int tail;

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight() {
        this.height = height;
    }

    public int getTail() {
        return tail;
    }

    public void setTail() {
        this.tail = tail;
    }

    public Mouse(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }

}

class Dog {
    String name;
    int height;
    int tail;

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight() {
        this.height = height;
    }

    public int getTail() {
        return tail;
    }

    public void setTail() {
        this.tail = tail;
    }

    public Dog(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }

}

class Cat {
    String name;
    int height;
    int tail;

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight() {
        this.height = height;
    }

    public int getTail() {
        return tail;
    }

    public void setTail() {
        this.tail = tail;
    }

    public Cat(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }
}


public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cat cat = new Cat("Tom", 44, 12);
        Dog dog = new Dog("Spike", 75, 6);
        Mouse mouse = new Mouse("Jerry", 12, 5);
        System.out.println(cat.name + " " + cat.height + " " + cat.tail);
        System.out.println(dog.name + " " + dog.height + " " + dog.tail);
        System.out.print(mouse.name + " " + mouse.height + " " + mouse.tail);
    }


}