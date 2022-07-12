package tasks05.task0509;

import java.util.Scanner;

class Friend {
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

    public Friend(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Friend(String name) {
        this.name = name;
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int age = s.nextInt();
        s.nextLine();
        char sex = s.next().charAt(0);
        Friend friend = new Friend(name, age, sex);
        System.out.print(friend.name+" "+ friend.age +" "+ friend.sex);
    }
}
