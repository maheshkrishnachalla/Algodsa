package com.refresher;

import java.util.Scanner;

public class GreetMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = scanner.next();
        System.out.println("Hello, "+name);
    }
}
