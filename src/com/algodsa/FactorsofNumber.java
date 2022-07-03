package com.algodsa;

import java.util.Scanner;

public class FactorsofNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number : ");
        int num = scanner.nextInt();
        int c = 2;
        while(c*c<=num){
            if(num%c==0){
                if (c!=num/c) {
                    System.out.print(c + " " + num / c + " ");
                }
                else{
                    System.out.print(c+" ");
                }
            }
            c++;
        }
        System.out.print(1+" "+num);
    }
}
