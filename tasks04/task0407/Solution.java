package tasks04.task0407;

public class Solution {
    static int count = 0;

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.print(count);
    }

    public static class Cat {

        Cat() {
            count++;
        }
    }
}
