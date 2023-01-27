package com.algodsa;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number :");
        int tr = scanner.nextInt();
        int[] nums = {23,45,1,2,8,-3,16,-11,19,20};
        int res = linearSearch(nums, tr);
        System.out.println("index of the result :"+res);
        int res2 = linearSearch2(nums, tr);
        System.out.println("index of the result :"+res2);
        boolean res3 = linearSearch3(nums, tr);
        System.out.println("index of the result :"+res3);
    }
    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int tr){
        if (arr.length==0){
            return -1;
        }
        // run for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = tr
            if (tr == arr[index]){
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }

    // search in the array if element found return element
    // if the element not found return Integer.MAX_VALUE
    static int linearSearch2(int[] arr, int tr){
        if (arr.length==0){
            return Integer.MAX_VALUE;
        }
        // run for loop
        for (int element : arr) {
            // check for element
            if (element == tr){
                return element;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }

    // search in the array if element found return true
    // if the element not found return false
    static boolean linearSearch3(int[] arr, int tr){
        if (arr.length==0){
            return false;
        }
        // run for loop
        for (int element : arr) {
            // check for element
            if (element == tr){
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }


}
