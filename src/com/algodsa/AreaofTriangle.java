package com.algodsa;

import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input sides
        System.out.println("Enter sides : ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if(a+b>c && b+c>a && c+a>b) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Area of Triangle with sides (" + a + "," + b + "," + c + ") is " + area);
        }
        else {
            System.out.println("Not a triangle");
        }
    }
}
