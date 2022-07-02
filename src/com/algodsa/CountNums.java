package com.algodsa;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = scanner.nextInt();
        System.out.println("Enter the digit count to find :");
        int dgt = scanner.nextInt();
        int count=0;
        while(n>0){
            int rem = n%10;
            if(rem==dgt){
                count++;
            }
            n=n/10;
        }
        System.out.println("count of "+dgt+" is "+count);
    }
}
