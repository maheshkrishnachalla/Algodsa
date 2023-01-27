package com.algodsa;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] ar = {'c','d','g','j'};
        char tr = 'a';
        char res = smallestLetter(ar,tr);
        System.out.println(res);
    }

    static char smallestLetter(char[] arr, char tr){
        int start = 0;
        int end = arr.length - 1;
        if (tr >= arr[end]){
            return arr[0];
        }
        while (start <= end){
            int mid = start + (end - start)/2;
            if (tr > arr[mid]){
                start = mid + 1;
            } else  {
                end = mid - 1;
            }
        }
        return arr[start%arr.length];
    }
}
