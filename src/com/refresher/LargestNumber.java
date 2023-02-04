package com.refresher;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int a = scanner.nextInt();
        System.out.print("Enter number 2 : ");
        int b = scanner.nextInt();
        int max = Math.max(a, b);
        System.out.println("Largest number = "+max);
        if(a >= b){
            System.out.println("Largest Number = "+a);
        }else {
            System.out.println("Largest Number = "+b);
        }

    }
}
