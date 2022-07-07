package com.algodsa;

import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int negSum = 0;
        while (true){
            System.out.println("enter number : ");
            int num = scanner.nextInt();
            if(num==0){
                break;
            }
            else{
                if(num>0 && num%2==0){
                    evenSum = evenSum+num;
                } else if (num>0 && num%2!=0) {
                    oddSum = oddSum+num;
                }else {
                    negSum = negSum+num;
                }
            }
        }
        System.out.println("sum of positive evens = "+evenSum);
        System.out.println("sum of positive odds = "+oddSum);
        System.out.println("sum of negative nums = "+negSum);
    }
}
