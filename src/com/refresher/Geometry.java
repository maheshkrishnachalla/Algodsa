package com.refresher;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius : ");
        double radius = scanner.nextDouble();
        System.out.print("Enter base : ");
        double base = scanner.nextDouble();
        System.out.print("Enter height : ");
        double height = scanner.nextDouble();
        System.out.print("Enter side : ");
        double side = scanner.nextDouble();
        System.out.print("Enter Inner angle : ");
        double angle = scanner.nextDouble();
        System.out.printf("circle Area = %.2f \n", circleArea(radius));
        System.out.printf("isosceles Triangle Area = %.2f \n",isoscelesTriangleArea(base, height));
        System.out.printf("rectangle Area =  %.2f \n",rectangleArea(base, height));
        System.out.printf("equilaterla Triangle Area =  %.2f \n",equilaterlaTriangleArea(base));
        System.out.printf("equilaterla Triangle Perimeter =  %.2f \n",equilaterlaTrianglePerimeter(base));
        System.out.printf("parallelogram Perimeter =  %.2f \n",parallelogramPerimeter(base, height));
        System.out.printf("rhombus Perimeter =  %.2f \n",rhombusPerimeter(height));
        System.out.printf("triangle Area if sides given =  %.2f \n",triangleArea(base, height, side));
        System.out.printf("parallelogram Area =  %.2f \n",parallelogramArea(base, height, angle));
        System.out.printf("rhombus Area =  %.2f",rhombusArea(height, angle));
    }

    static double circleArea(double radius){
        return 3.1415 * radius * radius;
    }

    static double isoscelesTriangleArea(double base , double height){
        return 0.5 * base * height;
    }

    static double rectangleArea(double base, double height){
        return base * height;
    }

    static double triangleArea(double a , double b, double c){
        double s = (a+b+c)/2;
        return  Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    static double parallelogramArea(double base, double height, double angle){
        double rad = Math.toRadians(angle);
        return base * height * Math.sin(rad);
    }

    static double rhombusArea(double base, double angle){
        double rad = Math.toRadians(angle);
        return base * base * Math.sin(rad);
    }

    static double equilaterlaTriangleArea(double a ){
        return  (Math.sqrt(3)/4) * a * a;
    }

    static double equilaterlaTrianglePerimeter(double a ){
        return  3*a;
    }

    static double parallelogramPerimeter(double a , double b){
        return  2 * (a + b);
    }

    static double rhombusPerimeter(double a ){
        return 4*a;
    }
}
