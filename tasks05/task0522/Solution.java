package tasks05.task0522;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int r = s.nextInt();
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(x);
        Circle circle3 = new Circle(x, y);
        Circle circle4 = new Circle(x, y, r);
        System.out.println(circle1.x + " " + circle1.y + " " + circle1.radius);
        System.out.println(circle2.x + " " + circle2.y + " " + circle2.radius);
        System.out.println(circle3.x + " " + circle3.y + " " + circle3.radius);
        System.out.print(circle4.x + " " + circle4.y + " " + circle4.radius);
    }
}

class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        this(x, y, 5);
    }

    public Circle(double x) {
        this(x, 4, 5);
    }

    public Circle() {
        this(1, 4, 5);
    }


}
