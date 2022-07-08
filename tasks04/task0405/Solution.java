package tasks04.task0405;

public class Solution {
    public static void main(String[] args) {
        setCatsCount catsCount = new setCatsCount();
        System.out.println("Сейчас у нас " + setCatsCount.catsCount + " котов.");
        catsCount.addNewCat(8);
        System.out.println("Теперь у нас " + setCatsCount.catsCount + " котов!");
    }

    public static class setCatsCount {
        public static int catsCount = 5;

        public void addNewCat(int catsCount) {
            this.catsCount = catsCount;
            System.out.println("Пересчитываем котов...");
        }
    }
}
