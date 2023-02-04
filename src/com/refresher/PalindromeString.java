package com.refresher;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count =100;
        while(count>0) {
            System.out.print("Enter String : ");
            String str = scanner.next();
            System.out.println(isPalindrome(str));
        }

    }

    static boolean isPalindrome(String str){
        char[] ch = str.toCharArray();
        int strLength = ch.length;
        for (int i=0; i<strLength/2+1;i++){
            if(ch[i]!=ch[strLength-1-i]){
                return false;
            }
        }
        return true;
    }
}
