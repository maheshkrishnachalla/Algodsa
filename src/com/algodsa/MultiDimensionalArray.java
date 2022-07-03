package com.algodsa;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][]; // column size of arr is optional

        int[][] arr2D = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        int[][] ar = new int[3][3];
        System.out.print("enter elements in array :");
        for(int row=0; row<ar.length;row++){
            for(int col=0;col<ar[row].length;col++){
                ar[row][col] = scanner.nextInt();
            }
        }

        for (int row = 0; row < ar.length; row++){
            for (int col = 0; col < ar[row].length; col++){
                System.out.print(ar[row][col]+" ");
            }
            System.out.println();
        }

        for (int row = 0; row < ar.length; row++){
            System.out.println(Arrays.toString(ar[row]));
        }

        // enhanced for loop
        for (int[] a: ar){
            System.out.println(Arrays.toString(a));
        }
    }
}
