package tasks06.task0613;

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            Cat cat = new Cat();
        }
        System.out.print(Cat.catCount);
    }

}

class Cat {
    public static int catCount = 0;

    public Cat() {
        catCount++;

    }
}
