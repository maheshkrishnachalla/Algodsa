package com.algodsa;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.next();
        switch (fruit) {
            case "mango":
                System.out.println("Yellow fruit");
                break;
            case "apple":
                System.out.println("Red fruit");
                break;
            case "Orange":
                System.out.println("round fruit");
                break;
            case "Grapes":
                System.out.println("small fruit");
                break;
            default:
                System.out.println("please enter valid fruit");
                break;
        }

        int day = scanner.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

        //if(fruit.equals("mango")){ // .equals only check the value

        //}
        //String a = "Kumar";
        //String b = "Kumar";
        //System.out.println(a==b);
        //System.out.println(a.equals(b));
    }
}
