package com.algodsa;

public class Floor {
    public static void main(String[] args) {
        int[] ar = {2, 3, 5, 9, 14, 16, 18};
        int tr = 15;
        int res = floor(ar,tr);
        System.out.println(res);
    }

    // find the less than or equal to the target, if the target is not found in an array
    // find the greatest number smaller than target from the array
    static int floor(int[] arr, int tr){
        int start = 0;
        int end = arr.length - 1;
        if (tr < arr[start]){
            return -1;
        }
        while (start <= end){
            int mid = start + (end-start)/2;
            if (tr > arr[mid]){
                start = mid + 1;
            } else if (tr < arr[mid]) {
                end = mid - 1;
            }else {
                return arr[mid];
            }
        }
        return arr[end];
    }

}
