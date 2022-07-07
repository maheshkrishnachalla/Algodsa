package com.algodsa;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("enter number :");
        int num = scanner.nextInt();
        boolean isPnm = isPerfectNumber(num);
        if(isPnm) {
            System.out.println(num+" is Perfect Number");
        }
        else{
            System.out.println(num+" is NOT Perfect Number");
        }*/
        for (int i = 1; i < 10000; i++) {
            if(isPerfectNumber(i)) {
                System.out.println(i+" is Perfect Number");
            }
        }
    }

    static boolean isPerfectNumber(int num) {
        int c=1;
        int sum = 0;
        while(c<=num/2){
            if(num%c==0){
                sum = sum+c;
            }
            c++;
        }
        //System.out.println("sum = "+sum);
        return sum==num;
    }

}
