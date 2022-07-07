package com.algodsa;

import java.util.Scanner;

public class AgeFunc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter age : ");
            int age = scanner.nextInt();
            boolean isEligibleforVote = isAge18(age);
            if (isEligibleforVote) {
                System.out.println("Person age is " + age + " eligible for vote");
            } else {
                System.out.println("Person age is " + age + " , under 18 NOT eligible for vote");
            }
        }

    }
    static boolean isAge18(int age){
        return age >= 18;
    }
}
