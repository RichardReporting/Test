package tasks05.task0506;

import java.util.Scanner;

class Person {
    String name;
    int age;
    String address;
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

    public String getAddress() {
        return address;
    }

    public String setAddress() {
        return address;
    }

    public char getSex() {
        return sex;
    }

    public void setSex() {
        this.sex = sex;
    }

    public Person(String name, int age, String address, char sex) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.sex = sex;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int age = s.nextInt();
        s.nextLine();
        String address = s.nextLine();
        char sex = s.next().charAt(0);

        Person person = new Person(name, age, address, sex);
        System.out.print(person.name+" " + person.age + " "+ person.address+ " "+ person.sex);

    }


}


