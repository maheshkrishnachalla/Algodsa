package com.algodsa;

public class Showdoing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x ; // the class variable is showdowed here
        x = 100; // scope will begin when the value is initialised
        System.out.println(x); //100
        fun();
    }

    static void fun() {
        System.out.println(x); //90
    }
}
