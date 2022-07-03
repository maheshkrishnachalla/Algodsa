package com.algodsa;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ros ; // declaration of array, ros is getting defined the stack
        ros = new int[5]; // initialisation: actually here object is being created in this
        System.out.println(ros[0]);

        String[] arr = new String[4];
        System.out.println(arr[1]);

        int[] ar = new int[5];
        ar[0] = 23;
        ar[1] = 123;
        ar[2] = 223;
        ar[3] = 523;
        ar[4] = 623;

        System.out.println(ar[3]);

        // input using for loops
        for(int i=0;i<ar.length;i++){
            ar[i] = scanner.nextInt();
        }
        for(int j=0;j<ar.length;j++){
            System.out.print(ar[j]+" ");
        }

        for(int num: ar){ // for every element in an array print the element
            System.out.print(num+" "); // here number represents element of the array

        }

        // array of objects
        String[] str = new String[5];
        for(int i=0;i<str.length;i++){
            str[i] = scanner.next();
        }
        System.out.println(Arrays.toString(str));

        str[1] = "kumar";
        System.out.println(Arrays.toString(str));


    }

    int roll_no1 = 1;
    int roll_no2 = 2;
    int roll_no3 = 3;

    // datatype variable_name = new datatype[size]
    // store 5 roll numbers
    int[] roll = new int[5];
    // or directly
    int[] rollIds = {1,2,3,4,5}; // the data in the array should be same type



}
