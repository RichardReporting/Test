package tasks05.task0518;

import java.util.Scanner;

class Dog {
    String name;
    int height;
    String color;

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

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public Dog(String name) {
        this.name = name;
        this.height = 5;
        this.color = "common";
    }

    public Dog(String name, int height) {
        this.name = name;
        this.height = height;
        this.color = "common";
    }

    public Dog(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int height = s.nextInt();
        s.nextLine();
        String color = s.nextLine();

        Dog dog1 = new Dog(name);
        Dog dog2 = new Dog(name, height);
        Dog dog3 = new Dog(name, height, color);

        System.out.println(dog1.name + " " + dog1.height + " " + dog1.color );
        System.out.println(dog2.name + " " + dog2.height + " " + dog2.color );
        System.out.print(dog3.name + " " + dog3.height + " " + dog3.color );
    }
}
