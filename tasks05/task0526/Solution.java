package tasks05.task0526;

import java.util.Scanner;

public class Solution {

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Man man1 = newMan(s);
        Man man2 = newMan(s);
        Woman woman1 = newWoman(s);
        Woman woman2 = newWoman(s);
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.print(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static Man newMan(Scanner s) {
        String name = s.nextLine();
        int age = s.nextInt();
        s.nextLine();
        String address = s.nextLine();
        Man man = new Man(name, age, address);

        return (man);

    }

    public static Woman newWoman(Scanner s) {
        String name = s.nextLine();
        int age = s.nextInt();
        s.nextLine();
        String address = s.nextLine();
        Woman woman = new Woman(name, age, address);

        return (woman);
    }

}
