package com.algodsa;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = scanner.nextInt();
        int revNum = 0;
        while(num>0){
            int rem = num%10;
            revNum = revNum*10+rem;
            num=num/10;
        }
        System.out.println(revNum);
    }
}
