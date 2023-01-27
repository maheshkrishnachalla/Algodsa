package com.refresher;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenorOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("Enter number : ");
                int n = scanner.nextInt();
                isEvenorOdd(n);
                isEvenorOddBitwise(n);
            }
        }catch (InputMismatchException e){
            System.out.println("done");
        }
    }

    static void isEvenorOdd(int n) {
        if(n%2==0)
            System.out.println(n+" is Even");
        else
            System.out.println(n+" is Odd");
    }

    static void isEvenorOddBitwise(int n) {
        if((n&1)==0){
            System.out.println(n+" is Even");
        }
        else{
            System.out.println(n+" is Odd");
        }
    }
}
