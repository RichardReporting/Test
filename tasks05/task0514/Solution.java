package tasks05.task0514;

import java.util.Scanner;

class Person {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int age = s.nextInt();

        Person person = new Person(name, age);

        System.out.print(person.name + " " + person.age);
    }
}
