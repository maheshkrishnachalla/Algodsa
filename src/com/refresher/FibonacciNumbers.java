package com.refresher;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = scanner.nextInt();
        //int ans = fibonacciNumber(n);
        //System.out.println(ans);
        //System.out.println(fibonacci(n));
        double res = fibnocciRecur(n);
        System.out.println(res);

    }

    static int fibonacciNumber(int n){
        double a = (1.0+Math.sqrt(5))/2;
        double b = (1.0-Math.sqrt(5))/2;
        double c = 1.0/Math.sqrt(5);
        return (int)(c*(Math.pow(a,n)-Math.pow(b,n)));
    }

    static double fibonacci(int n){
        double a = 0;
        double b = 1;
        double c = 1;
        double x = n-2;
        if (n==1){
            return a;
        }
        else if(n==2){
            return b;
        }
        else{
            while(x>0){
                c = a+b;
                System.out.println("c = "+c);
                a = b;
                b = c;
                System.out.println("x = "+x);
                x--;
            }
            return c;
        }
    }

    static double fibnocciRecur(int n){
        if(n<=1) {
            return n;
        }
        else {
            return fibnocciRecur(n - 1) + fibnocciRecur(n - 2);
        }
    }
}
