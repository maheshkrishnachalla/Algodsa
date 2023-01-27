package com.algodsa;

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,8,12,10,7,4,2};
        int tr = 6;
        int res = search(arr, tr);
        System.out.println(res);
    }

    static int search(int[] arr, int tr){
        int peak = peakIndexinMountainArray(arr);
        System.out.println(peak);
        int firstTry = orderAgnosticBs(arr, tr, 0, peak);
        if (firstTry != -1 ){
            return firstTry;
        }
        return orderAgnosticBs(arr, tr, peak+1, arr.length-1);
    }

    static int peakIndexinMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start; // or end as both are =
    }

    static int orderAgnosticBs(int[] arr, int tr, int start, int end){
        boolean isAsc = arr[start] <= arr[end];
        while(start <= end){
            int mid = start + (end - start)/2;
            if(tr == arr[mid]){
                return mid;
            }
            if (isAsc){
                if (arr[mid] > tr){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else{
                if (arr[mid] < tr){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
