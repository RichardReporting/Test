package tasks06.task0605;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double weight = s.nextDouble();
        double height = s.nextDouble();
        double massIndex = weight / (height * height);
        indexChecker(massIndex);
    }

    public static void indexChecker(double massIndex) {
        if (massIndex < 18.5) {
            System.out.print("Недовес: меньше, чем 18.5");
            return;
        }
        if (massIndex < 24.9) {
            System.out.print("Нормальный: между 18.5. и 24.9");
            return;
        }
        if (massIndex < 29.9) {
            System.out.print("Избыточный вес: между 25 и 29.9");
            return;
        }
        System.out.print("Ожирение: 30 или больше");
        return;
    }
}
