package tasks04.task0403;

public class Solution {
    public static void main(String[] args) {
        CurrentName name = new CurrentName();
        System.out.println("Старое имя: " + CurrentName.name);
        name.setName("Вова");
        System.out.println("Новое имя: " + CurrentName.name);
    }

    public static class CurrentName {
        private static String name = "Петя";

        public void setName(String name) {
            this.name = name;
            System.out.println("Меняем имя на: " + name);
        }
    }
}