package com.algodsa;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input radius of circle
        System.out.println("Enter radius : ");
        double radius = scanner.nextDouble();
        final double pi= 3.14159;
        double area = pi*radius*radius;
        System.out.println("Area of circle with radius ("+radius+") is "+area);
    }
}
