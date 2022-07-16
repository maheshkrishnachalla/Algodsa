package com.algodsa;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ar = {-10, -8, -6, 0, 2, 5, 7, 15, 18, 22, 36,45};
        int tr = 7;
        System.out.println(binarySearch(ar, tr));

    }
    // return the index of element in array
    static int binarySearch(int[] arr, int tr){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            // find the middle element
            int mid = start + (end - start)/2;
            if (tr == arr[start]){
                return start;
            } else if (tr == arr[end]) {
                return end;
            } else if(tr < arr[mid]){
                end = mid - 1;
            } else if (tr > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }

        }
        return -1;
    }
}
