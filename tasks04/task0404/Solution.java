package tasks04.task0404;

public class Solution {
    public static void main(String[] args) {
        CatsCount catsCount = new CatsCount();
        System.out.println("Сейчас у нас " + CatsCount.catsCount + " котов.");
        catsCount.addNewCat();
        System.out.println("Теперь у нас " + CatsCount.catsCount + " котов!");
    }

    public static class CatsCount {
        public static int catsCount = 5;

        public void addNewCat() {
            this.catsCount++;
            System.out.println("Добавляем кота...");
        }
    }
}
