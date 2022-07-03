package com.algodsa;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number :");
        int num = scanner.nextInt();
        factorialLoop();
        System.out.println(factorialRecursive(num));
    }

    static void factorialLoop(){
        for (int i = 0; i <= 10; i++) {
            int fact = 1;
            int num = i;
            while(num>1){
                fact = fact*(num);
                num--;
            }
            System.out.println(fact);
        }
    }

    static int factorialRecursive(int num){
        if (num == 0 || num ==1){
            return 1;
        }
        else{
            return num*factorialRecursive(num-1);
        }
    }

}
