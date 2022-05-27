package com.algodsa;

import org.omg.Messaging.SyncScopeHelper;

import java.util.Scanner;

public class LoopsandCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // calculate the value using operator 
        while (true) {
            int result = 0;
            // input operator
            System.out.println("Enter operator : ");
            char ch = scanner.next().trim().charAt(0);
            // condition to check operator 
            if(ch=='+'||ch=='*'||ch=='-'||ch=='/'||ch=='%'){
                // input two numbers
                System.out.println("Enter numbers :");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                // add
                if(ch=='+'){
                    result=a+b;
                }
                if(ch=='*'){
                    result=a*b;
                }
                if(ch=='-'){
                    result=a-b;
                }
                if(ch=='/'){
                    if(b!=0) {
                        result = a / b;
                    }
                }
                if(ch=='%'){
                    if(b!=0) {
                        result = a % b;
                    }

                }
            } else if (ch=='X' || ch=='x') {
                break;
            }
            else {
                System.out.println("invalid operator");
            }
            System.out.println(result);
        }
    }
}
