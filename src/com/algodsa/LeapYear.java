package com.algodsa;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("enter year : ");
            int year = scanner.nextInt();
            if (isLeapYear(year)) {
                System.out.println(year + " is Leap year");
            } else {
                System.out.println(year + " is NOT Leap year");
            }
        }
    }

    static boolean isLeapYear(int year) {
        if(year%400 ==0){
            return true;
        } else if (year%100 == 0) {
            return false;
        } else if (year%4 == 0) {
            return true;
        }
        return false;
    }
}
