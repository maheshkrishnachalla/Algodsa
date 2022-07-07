package com.algodsa;

import java.util.Scanner;

public class StudentMarksFunc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter marks :");
            int marks = scanner.nextInt();
            System.out.println("grade = " +grades(marks));
        }

    }
    static String grades(int marks){
        if (marks >=  91 && marks <= 100) {
            return "AA";
        } else if (marks >=  81 && marks <= 90) {
            return "AB";
        } else if (marks >=  71 && marks <= 80) {
            return "BB";
        } else if (marks >=  61 && marks <= 70) {
            return "BC";
        } else if (marks >=  51 && marks <= 60) {
            return "CD";
        } else if (marks >=  41 && marks <= 50) {
            return "DD";
        }else {
            return "you got another chance to prove you ";
        }
    }
}
