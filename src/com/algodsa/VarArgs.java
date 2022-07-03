package com.algodsa;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //fun(1,2,3,4,5,6);
        fun();
        multiple(10,20,30,"hi");

    }

    static void multiple(int a, int b, int c, String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
