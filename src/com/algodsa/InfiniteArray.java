package com.algodsa;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,8,12,20,30,40,100,120,200};
        int tr = 12;
        int res = result(arr,tr);
        System.out.println(res);

    }

    static int result(int[] arr, int tr){
        int start = 0;
        int end = 1;
        while(tr > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, tr, start, end);
    }
    // binary search of the element index
    static int binarySearch(int[] arr, int tr, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if (tr > arr[mid]){
                start = mid + 1;
            } else if (tr < arr[mid]) {
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
