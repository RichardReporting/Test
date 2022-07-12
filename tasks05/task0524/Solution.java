package tasks05.task0524;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        double y = s.nextDouble();
        double r = s.nextDouble();
        Circle circle = new Circle(x, y, r);
        System.out.print(circle.x + " " + circle.y + " " + circle.r);
    }
}

class Circle {
    public double x;
    public double y;
    public double r;

    public double getX() {
        return x;
    }

    public void setX() {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY() {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR() {
        this.r = r;

    }

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

}