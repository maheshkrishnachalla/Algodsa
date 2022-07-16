package com.algodsa;

import java.util.Arrays;

public class Searchin2DArray {
    public static void main(String[] args) {
        int[][] arr = {{23,4,1},
                {18,12,3,9},
                {79,99,34,56},
                {18,12}};

        int tr = 34;
        int[] res = searchin2D(arr,tr);
        System.out.println(Arrays.toString(res));
        System.out.println("max value in 2D array = " +maxin2D(arr));
        System.out.println("min value in 2D array = " +minin2D(arr));
    }
    static int[] searchin2D(int[][] arr, int tr){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == tr){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int maxin2D(int[][] arr){
        int maxVal = Integer.MIN_VALUE;
        for (int[] row: arr) {
            for (int element: row) {
                if(element>maxVal){
                    maxVal = element;
                }
            }
        }
        return maxVal;
    }

    static int minin2D(int[][] arr){
        int minVal = Integer.MAX_VALUE;
        for (int[] row: arr) {
            for (int element: row) {
                if(element<minVal){
                    minVal = element;
                }
            }
        }
        return minVal;
    }
}
