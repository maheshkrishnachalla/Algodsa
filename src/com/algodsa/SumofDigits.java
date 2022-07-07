package com.algodsa;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num :");
        int num = scanner.nextInt();
        System.out.println("sum of digits = "+digitsSum(num));

    }
    static int digitsSum(int n){
        int sum = 0;
        while(n>0){
            sum = sum+n%10;
            n=n/10;
        }
        return sum;
    }
}
