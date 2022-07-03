package com.algodsa;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
        fun(10);
        //fun("Ganesh");
        System.out.println(sum(5,6));
        System.out.println(sum(7,9,10));
        dmt(10,20);
        dmt("Hi","Hello");
        //dmt(); // ambiguous
    }

    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);
    }

    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static void dmt(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void dmt(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
