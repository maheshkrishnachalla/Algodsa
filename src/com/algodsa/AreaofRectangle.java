package com.algodsa;

import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input base and height
        System.out.println("Enter base and height");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        double area = base*height;
        System.out.println("Area of Rectangle with base("+base+") and height("+height+") is "+area);

    }
}
