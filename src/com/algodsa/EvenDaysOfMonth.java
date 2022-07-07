package com.algodsa;

import java.util.Scanner;
import com.algodsa.LeapYear;

public class EvenDaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter year :");
        int year = scanner.nextInt();
        System.out.println("enter month :");
        int month = scanner.nextInt();
        int days = 0;
        switch (month){
            case 1 : days=31;
                break;
            case 2 : if(LeapYear.isLeapYear(year)){
                days =29;
            }
            else{
                days =28;
            }
                break;
            case 3 : days=31;
                break;
            case 4 : days=30;
                break;
            case 5 : days=31;
                break;
            case 6 : days=30;
                break;
            case 7 : days=31;
                break;
            case 8 : days=31;
                break;
            case 9 : days=30;
                break;
            case 10 : days=31;
                break;
            case 11 : days=30;
                break;
            case 12 : days=31;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + month);
        }

        System.out.println("number of days in monthy = "+ days);
        if(days/2==0) {
            System.out.println("even days = " + days/2);
            System.out.println("odd days = " + days/2);
        }
        else {
            System.out.println("even days = " + days/2);
            System.out.println("odd days = " + (days/2+1));
        }


    }
}
