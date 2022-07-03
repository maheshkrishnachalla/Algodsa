package com.algodsa;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number : ");
        int num = scanner.nextInt();
        System.out.println(isPalindromeNumber(num));
    }

    static boolean isPalindromeNumber(int num) {
        int original = num;
        int r = 0;
        int sum = 0;
        while(num>0){
            r = num%10;
            sum = sum*10 + r;
            num = num/10;
        }
        System.out.println(sum);
        return sum==original;
    }
}
