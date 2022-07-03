package com.algodsa;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {18,23,77,19,59,88};
        System.out.println(Arrays.toString(arr));
        swap(arr, 1,3);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        /*int len = (arr.length/2)+1;
        for (int i = 0; i < len; i++) {
            if(start<=end){
                swap(arr,start,end);
            }
            start++;
            end--;
        }*/
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
