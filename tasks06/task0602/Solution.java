package tasks06.task0602;

public class Solution {
    public static void main(String[] args) {

    }
    class Cat {
        protected void finalize() throws Throwable {
            System.out.println("Cat is empty now...");
            super.finalize();
        }
    }

    class Dog{
        protected void finalize() throws Throwable{
            System.out.println("Dog is empty now...");
            super.finalize();
        }
    }
}
