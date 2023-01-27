package com.algodsa;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12,7,3,1,-7,14, 20};
        System.out.println(min(arr));

    }
    // assum arr.length is not equal to zero
    static int min(int[] arr){
        int minVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minVal > arr[i]) {
                minVal = arr[i];
            }
        }
        return minVal;
    }
}
