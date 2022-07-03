package com.algodsa;

import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter String :");
        String str = scanner.nextLine();
        char[] chr = str.toCharArray();
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            swap(chr,start,end);
            start++;
            end--;
        }
        for(char c: chr){
            System.out.print(c);
        }
    }

    static void swap(char[] ch, int a, int b){
        char temp = ch[a];
        ch[a] = ch[b];
        ch[b] = temp;
    }
}
