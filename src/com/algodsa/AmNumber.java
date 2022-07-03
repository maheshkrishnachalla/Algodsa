package com.algodsa;

import java.util.Scanner;

public class AmNumber {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scanner.nextInt();
        boolean res = isAmNumber(n);
        System.out.println(res);
        */
        for(int i=100;i<1000;i++){

            if(isAmNumber(i)) {
                System.out.print(i+" ");
            }
        }

    }

    static boolean isAmNumber(int n) {
        int original = n;
        int sum = 0;
        int c=3;
        while(n>0){
            int rem = n%10;
            sum = sum+(int)Math.pow(rem,c);
            n=n/10;
        }
        return sum==original;
    }
}
