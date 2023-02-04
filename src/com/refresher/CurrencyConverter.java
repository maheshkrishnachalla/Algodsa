package com.refresher;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rupee :");
        double rupee = scanner.nextDouble();
        System.out.print("Enter rate :");
        double rate = scanner.nextDouble();
        double usd = rupee/rate;
        System.out.printf("usd = "+"%.2f",usd);
    }
}
