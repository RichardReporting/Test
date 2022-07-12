package tasks05.task0516;

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

    public Friend(String name) {
        this.name = name;
        this.age = 20;
        this.sex = 'x';
    }

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
        this.sex = 'x';

    }

    public Friend(String name, int age, char sex) {
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

        Friend friend1 = new Friend(name, age, sex);
        Friend friend2 = new Friend(name, age);
        Friend friend3 = new Friend(name);

        System.out.println(friend1.name + " " + friend1.age + " " + friend1.sex );
        System.out.println(friend2.name + " " + friend2.age + " " + friend2.sex );
        System.out.print(friend3.name + " " + friend3.age + " " + friend3.sex);

    }


}


