package com.algodsa;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        int tr = 5;
        int res = findPivot(arr);
        System.out.println(res);
        int eleRes = searchinPivotArray(arr,tr);
        System.out.println(eleRes);
    }
    static int searchinPivotArray(int[] arr, int tr){
        int pivot = findPivot(arr);
        int first = binarySearch(arr,tr, 0,pivot);
        if (first != -1){
            return first;
        }
        return binarySearch(arr,tr,pivot+1,arr.length - 1);
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            // case 1:
            if(mid < end && arr[mid] > arr[mid + 1]){
                return  mid;
            }
            else if (start > mid && arr[mid] < arr[mid -1]) {
                return mid - 1;
            }
            else if (arr[mid] <= arr[start]) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr, int tr, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] > tr){
                end = mid - 1;
            } else if (arr[mid] < tr) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
