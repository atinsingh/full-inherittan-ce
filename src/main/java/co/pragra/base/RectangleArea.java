package co.pragra.base;

import java.util.Scanner;

public class RectangleArea extends Rectangle {
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width");
        int w = scanner.nextInt();
        System.out.println("Enter the Height");
        int h = scanner.nextInt();
        setWidth(w);
        setHight(h);
    }

    public int area(){
        return getHight()*getWidth();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Area is "+ area());
    }
}
