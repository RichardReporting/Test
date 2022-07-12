package tasks05.task0503;

import java.util.Scanner;

public class Solution {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    static class Dog{
        String name;
        int age;
    }

    public static void newDog(Dog dog, Scanner s){
        dog.name = s.nextLine();
        dog.age = s.nextInt();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Dog dog = new Dog();
        newDog(dog, s);
        System.out.print(dog.name+ " " + dog.age);

    }
}
