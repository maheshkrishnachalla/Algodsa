package com.algodsa;

import java.util.Arrays;

public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        int[] ar = {2, 3, 5, 7, 7, 7, 7, 8, 8, 14, 16, 18};
        int tr = 7;
        int[] res = firstandLastPosition(ar,tr);
        System.out.println(Arrays.toString(res));
    }
    //find first and last index of the target in the array
    static int[] firstandLastPosition(int[] arr, int tr){
        int[] res = {-1, -1};
        int start = -1;
        int end = -1;
        start = search(arr, tr, true);
        if (start !=-1) {
            end = search(arr, tr, false);
        }
        res[0] = start;
        res[1] = end;
        return res;
    }

    // find the start index of target
    static int search(int[] arr, int tr, boolean findStartIndex){
        int res = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (tr > arr[mid]) {
                start = mid + 1;
            } else if (tr < arr[mid]) {
                end = mid - 1;
            } else {
                res = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return res;
    }

}
