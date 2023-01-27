package com.refresher;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year equal to or greater than 1582:");
        int year = scanner.nextInt();
        for(int i = 1582; i<=year; i++ ) {
            if(isLeapYear(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isLeapYear(int year){
        if(year%400==0) {
            return true;
        } else if (year%100==0) {
            return false;
        } else return year % 4 == 0;
    }
}
