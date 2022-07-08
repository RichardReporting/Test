package tasks04.task0402;

public class Solution {
    public static void main(String[] args) {
        ApplePrice applePrice = new ApplePrice();
        System.out.println("Суммарная стоимость яблок: " + ApplePrice.applePrice);
        applePrice.addPrice(50);
        System.out.println("Новая суммарная стоимость: " + ApplePrice.applePrice);
    }

    public static class ApplePrice {
        public static int applePrice = 20;

        public void addPrice(int applePrice) {
            this.applePrice += applePrice;
            System.out.println("Корректируем стоимость на: " + applePrice);
        }
    }
}