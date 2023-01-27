package com.algodsa;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] ar = {-10, -8, -6, 0, 2, 5, 7, 15, 18, 22, 36,45};
        int[] ar2 = {90,82,77,73,68,50,46,45,38,30,25,21,19,11,9,5};
        int tr = 19;
        int res = orderAgnosticBS(ar2, tr);
        System.out.println(res);
    }

    // find the element in array
    static int orderAgnosticBS(int[] arr, int tr){
        int start = 0;
        int end = arr.length - 1;
        // find whehter array is sorted in ascending or descending order
        boolean isAsc = arr[start] <= arr[end];

        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == tr){
                return mid;
            }
            if (isAsc){
                if (tr > arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
            else{
                if (tr < arr[mid]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
