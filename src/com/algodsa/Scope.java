package com.algodsa;

public class Scope {
    public static void main(String[] args) {
        int a;
        {
            //int a = 78;
            a = 90;
            int b = 99;
            System.out.println(a+" "+b);
        }
        random(100);
    }

    static void random(int marks){
        int num = 97;
        System.out.println(num);
        System.out.println(marks);
    }
}
