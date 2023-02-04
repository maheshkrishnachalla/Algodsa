package com.refresher;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Lower boundary number :");
        int a = scanner.nextInt();
        System.out.print("Enter Higher boundary number :");
        int b = scanner.nextInt();
        //boolean res = isArmStrongNumber(a);
        //System.out.println(res);
        int counter = 0;
        while(a<=b){
            if(isArmStrongNumber(a)){
                System.out.print(a+", ");
            }
            a++;
            counter++;
        }
        System.out.println("counter = "+counter);
    }

    static boolean isArmStrongNumber(int n) {
        int original = n;
        int sum = 0;
        int p = (int)Math.log10(n)+1;
        while(n>0){
            int d = n%10;
            sum = (int)(sum + Math.pow(d,p));
            n = n/10;
        }
        return (original == sum) ;
    }
}
