package com.algodsa;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
        int n = input.nextInt();
        for(int num=1;num<=n;num+=1){
            //System.out.println(num);
            System.out.println("Hello World");
        }
        int num1 = 1;
        do{
            System.out.println(n);
            num1++;
        }while (num1<=1);
    }
}
