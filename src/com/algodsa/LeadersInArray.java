package com.algodsa;

public class LeadersInArray {
    static void leadersInArray_frontSearch(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int j;
            for(j= i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    break;
                }
            }
            if(j==n){
                System.out.print(arr[i]+" ");
            }
        }
    }

    static void leadersInArray_backSearch(int[] arr){
        int n = arr.length;
        int max = arr[n-1];
        System.out.print(max+ " ");
        for(int i = n-2;i>=0;i--){
            if(max<arr[i]){
                max=arr[i];
                System.out.print(max+ " ");
            }

        }
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 2, 4, 3, 5, 2};
        System.out.println("front search");
        leadersInArray_frontSearch(arr);
        System.out.println();
        System.out.println("back search");
        leadersInArray_backSearch(arr);
    }
}
