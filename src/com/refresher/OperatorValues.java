package com.refresher;

import java.util.Scanner;

public class OperatorValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 100;
        while(count > 0) {
            try {
                System.out.print("Enter operator : ");
                char ch = scanner.next().charAt(0);
                System.out.print("Enter number 1 : ");
                int a = scanner.nextInt();
                System.out.print("Enter number 2 : ");
                int b = scanner.nextInt();

                if (ch == '+') {
                    System.out.println("a + b = " + (a + b));
                } else if (ch == '-') {
                    System.out.println("a - b = " + (a - b));
                } else if (ch == '*') {
                    System.out.println("a * b = " + (a * b));
                } else if ((ch == '/')) {
                    System.out.println("a / b = " + (a / b));
                } else {
                    System.out.println("a % b = " + (a % b));
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            count--;
        }

    }
}
