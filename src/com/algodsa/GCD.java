package com.algodsa;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num1 =");
        int num1 = scanner.nextInt();
        System.out.println("enter num2 =");
        int num2 = scanner.nextInt();
        System.out.println("gcd of "+num1+" and "+num2+" = "+gcd(num1,num2));
    }

    static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        System.out.println("b = "+b);
        System.out.println("a%b = "+a%b);
        return gcd(b,a%b);
    }
}
