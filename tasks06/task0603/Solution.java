package tasks06.task0603;

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 50000; i++) {
            Dog dog = new Dog();
            Cat cat = new Cat();
        }
    }

    static class Dog {
        public static void Dog() {
        }

        protected void finalize() throws Throwable {
            System.out.println("Dog down");
            super.finalize();
        }
    }

    static class Cat {
        public static void Cat() {
        }

        protected void finalize() throws Throwable {
            System.out.println("Cat down");
            super.finalize();
        }
    }
}
