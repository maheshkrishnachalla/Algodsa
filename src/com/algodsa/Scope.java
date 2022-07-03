package com.algodsa;

public class Scope {
    public static void main(String[] args) {
        int a=70;
        {
            //int a = 78; // if already initialised the value outside the block you cannot initialize again
            a = 90; // reasign the original value to some other value
            int b = 99; // values initialized in this block, will remain in this block
            System.out.println(a+" "+b);

        }
        random(100);

        // scoping in for loops
        for(int i=0; i<10;i++){
            System.out.println(i);
        }
    }

    static void random(int marks){
        int num = 97;
        System.out.println(num);
        System.out.println(marks);
    }
}
