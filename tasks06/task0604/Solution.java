package tasks06.task0604;

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 50000; i++) {
            Cat cat = new Cat();
        }
    }

    public static class Cat {
        static int catCount = 0;

        public void Cat() {
            catCount++;
        }

        protected void finalize() throws Throwable {
            catCount--;
            super.finalize();
        }

    }
}
