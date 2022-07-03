package com.algodsa;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("enter number : ");
            int num = scanner.nextInt();
            boolean res = isPrime(num);
            System.out.println(res);
        }
    }

    static boolean isPrime(int num) {
        if(num<1){
            return false;
        }
        int c = 2;
        while(c*c<=num){
            if(num%c==0){
                return false;
            }
            c++;
        }
        return c * c > num;
    }
}
