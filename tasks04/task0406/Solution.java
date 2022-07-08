package tasks04.task0406;

public class Solution {
    private String fullName = "Петя";

    public void setName() {
        System.out.println("Старое имя: " + this.fullName);
        System.out.println("Меняем имя на: " + fullName);
        String fullName = "Вова";
        this.fullName = fullName;
        System.out.println("Новое имя: " + this.fullName);

    }

    public static void main(String[] args) {
        Solution test = new Solution();
        test.setName();
    }
}