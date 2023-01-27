package com.refresher;

import java.util.Scanner;

public class MultiplicationofNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = scanner.nextInt();
        for(int i=1; i<=20;i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
