package com.algodsa;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        try {
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter nth num :");
                int num = scanner.nextInt();
                int a = 0;
                int b = 1;
                int count = 2;
                if (num == 0) {
                    System.out.println(num + "th fibo numb = " + a);
                } else if (num == 1) {
                    System.out.println(num + "th fibo numb = " + b);
                } else {
                    while (count <= num) {
                        b = b + a;
                        a = b - a;
                        count++;
                    }
                    System.out.println(num + "th fibo numb = " + b);
                }
            } while (true);
        }catch (Exception e){
            System.out.println("done");
        }
    }
}
