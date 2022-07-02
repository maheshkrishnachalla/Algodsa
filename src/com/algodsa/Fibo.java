package com.algodsa;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter nth num :");
            int num = scanner.nextInt();
            int a = 0;
            int b = 1;
            int count = 2;
            if (num == 0) {
                System.out.println(num + "th fibo numb = " + a);
            }
            if (num == 1) {
                System.out.println(num + "th fibo numb = " + b);
            }
            if (num >= 2) {
                while (count <= num) {
                    b = b + a;
                    a = b - a;
                    count++;
                }
                System.out.println(num + "th fibo numb = " + b);
            }
        }
    }
}
