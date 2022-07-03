package com.algodsa;

import java.util.Arrays;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {4,12,2,9,18};
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
        System.out.println(maxInRange(arr,1,3));
    }
    static int max(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int maxInRange(int[] arr, int start, int end){
        if(end<start){
            return -1;
        }
        if (arr == null){
            return -1;
        }
        int maxVal = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
