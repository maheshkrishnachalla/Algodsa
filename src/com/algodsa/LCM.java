package com.algodsa;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num1 : ");
        int num1 = scanner.nextInt();
        System.out.println("enter num2 : ");
        int num2 = scanner.nextInt();
        System.out.println(lcm(num1,num2));

    }


    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        System.out.println("a ="+a);
        System.out.println("b ="+b);
        System.out.println("b%a = "+b%a);
        return gcd(b%a,a);
    }
    static int lcm(int a, int b){
        return (a/gcd(a,b))*b;
    }
}
