package com.algodsa;

public class Ceiling {
    public static void main(String[] args) {
        int[] ar = {2, 3, 5, 9, 14, 16, 18};
        int tr = 19;
        int res = ceiling(ar,tr);
        System.out.println(res);
    }

    // find the greater than or equal to the target, if the target is not found in an array
    // find the smallest number greater than target from the array
    static int ceiling(int[] arr, int tr){
        int start = 0;
        int end = arr.length - 1;
        if(tr > arr[end]){
            return -1;
        }
        while (start <= end){
            int mid = start + (end - start)/2;
            if(tr > arr[mid]){
                start = mid +1;
            } else if (tr < arr[mid]) {
                end = mid - 1;
            }else {
                return arr[mid];
            }
        }

        return arr[start];
    }

}
