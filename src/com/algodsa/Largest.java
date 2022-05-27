package com.algodsa;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Q Find the Largest Number from three numbers
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println(max);

        int maxNum = Math.max(c,Math.max(a,b));
        System.out.println(maxNum);
    }
}
