package com.refresher;

import java.util.Scanner;


public class SumofInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        try {
            while (true) {
            System.out.print("Enter number :");
            int a = scanner.nextInt();
            sum = sum + a;
            }
        }catch (Exception e){
            System.out.println("done");
        }
        System.out.println("sum = "+sum);
    }
}
