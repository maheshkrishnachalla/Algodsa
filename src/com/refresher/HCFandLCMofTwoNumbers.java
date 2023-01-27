package com.refresher;

import java.util.Scanner;

public class HCFandLCMofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = scanner.nextInt();
        System.out.print("Enter second number : ");
        int b = scanner.nextInt();
        int gcd = gcd(a,b);
        System.out.println("G.C.D of ("+a+","+b+") = "+gcd);
        int lcm = (a*b)/gcd;
        System.out.println("L.C.M of ("+a+","+b+") = "+lcm);
// (534446,532711)
    }
//344 5345
    static int gcd(int a, int b) {
        int result = Math.min(a,b);
        int counter = 0;
        try {
            while (result > 0) {
                if (a % result == 0 && b % result == 0) {
                    break;
                }
                counter++;
                //result--;
                result = Math.max(a % result, b % result);

            }
        }catch (ArithmeticException e){
            return result;
        }
        System.out.println("counter = "+counter);
        return result;
    }

    static int gcd_type2(int a, int b){
        if(b==0){
            return a;
        }
        return gcd_type2(b,a%b);
    }
}
