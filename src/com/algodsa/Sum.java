package com.algodsa;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
        int a = sum2();
        System.out.println(a);
        int res = sum3(10,20);
        System.out.println(res);
    }

    static void sum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num1 :");
        int num1 = scanner.nextInt();
        System.out.println("enter num2 :");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("sum of numbers = "+sum);
    }

    static int sum2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num1 :");
        int num1 = scanner.nextInt();
        System.out.println("enter num2 :");
        int num2 = scanner.nextInt();
        return num1 + num2;
    }

    static int sum3(int a, int b){
        return a+b;
    }
}
