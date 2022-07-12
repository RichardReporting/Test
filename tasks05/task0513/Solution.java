package tasks05.task0513;

import java.util.Scanner;

class Rectangle {
    int top;
    int left;
    int height;
    int wight;

    public int getTop() {
        return top;
    }

    public void setTop() {
        this.top = top;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft() {
        this.left = left;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight() {
        this.height = height;
    }

    public int getWight() {
        return wight;
    }

    public void setWight() {
        this.wight = wight;
    }


    public Rectangle() {
        this.top = 0;
        this.left = 0;
        this.height = 0;
        this.wight = 0;
    }

    public Rectangle(int top) {
        this.top = top;
        this.left = 0;
        this.height = 0;
        this.wight = 0;
    }

    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;
        this.height = 0;
        this.wight = 0;
    }

    public Rectangle(int top, int left, int height) {
        this.top = top;
        this.left = left;
        this.height = height;
        this.wight = height;
    }

    public Rectangle(int top, int left, int height, int wight) {
        this.top = top;
        this.left = left;
        this.height = height;
        this.wight = wight;
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int top = s.nextInt();
        int left = s.nextInt();
        int height = s.nextInt();
        int wight = s.nextInt();

        Rectangle rectangle1 = new Rectangle(top, left, height, wight);
        Rectangle rectangle2 = new Rectangle(top, left, height);
        Rectangle rectangle3 = new Rectangle(top, left);
        Rectangle rectangle4 = new Rectangle(top);
        Rectangle rectangle5 = new Rectangle();

        System.out.println(rectangle1.top + " " + rectangle1.left + " " + rectangle1.height + " " + rectangle1.wight );
        System.out.println(rectangle2.top + " " + rectangle2.left + " " + rectangle2.height + " " + rectangle2.wight );
        System.out.println(rectangle3.top + " " + rectangle3.left + " " + rectangle3.height + " " + rectangle3.wight );
        System.out.println(rectangle4.top + " " + rectangle4.left + " " + rectangle4.height + " " + rectangle4.wight );
        System.out.print(rectangle5.top + " " + rectangle5.left + " " + rectangle5.height + " " + rectangle5.wight );
    }
}
