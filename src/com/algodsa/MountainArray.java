package com.algodsa;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,8,12,10,7,4,2};
        int res = search(arr);
        System.out.println(res);
    }
    static int search(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start; // or return end as both =
    }
}
