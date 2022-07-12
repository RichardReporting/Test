package tasks05.task0508;

import java.util.Scanner;

class Person {
    String name;
    int age;
    char sex;

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

    public char getSex() {
        return sex;
    }

    public void setSex() {
        this.sex = sex;
    }

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int age = s.nextInt();
        s.nextLine();
        char sex = s.next().charAt(0);

        Person person = new Person(name, age, sex);
        System.out.print(person.name+" " + person.age + " " + person.sex);

    }


}


