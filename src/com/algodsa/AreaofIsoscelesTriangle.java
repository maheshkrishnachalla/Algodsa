package com.algodsa;

import java.util.Scanner;

public class AreaofIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base and height of triangle :");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        double area = 0.5*base*height;
        System.out.println("Area of Triangle with base ("+base+") and height ("+height+") is "+area);
    }
}
