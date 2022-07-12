package tasks05.task0512;

import java.util.Scanner;

class Circle {
    int centerX;
    int centerY;
    int radius;
    int wight;
    String color;

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX() {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY() {
        this.centerY = centerY;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius() {
        this.radius = radius;
    }

    public int getWight() {
        return wight;
    }

    public void setWight() {
        this.wight = wight;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public Circle(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.wight = 1;
        this.color = "black";
    }

    public Circle(int centerX, int centerY, int radius, int wight) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.wight = wight;
        this.color = "black";
    }

    public Circle(int centerX, int centerY, int radius, int wight, String color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.wight = wight;
        this.color = color;
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int centerX = s.nextInt();
        int centerY = s.nextInt();
        int radius = s.nextInt();
        int wight = s.nextInt();
        s.nextLine();
        String color = s.nextLine();

        Circle circle1 = new Circle(centerX, centerY, radius);
        Circle circle2 = new Circle(centerX, centerY, radius, wight);
        Circle circle3 = new Circle(centerX, centerY, radius, wight, color);

        System.out.println(circle1.centerX + " " + circle1.centerY + " " + circle1.radius + " " + circle1.wight + " " + circle1.color);
        System.out.println(circle2.centerX + " " + circle2.centerY + " " + circle2.radius + " " + circle2.wight + " " + circle2.color);
        System.out.print(circle3.centerX + " " + circle3.centerY + " " + circle2.radius + " " + circle2.wight + " " + circle3.color);
    }
}
