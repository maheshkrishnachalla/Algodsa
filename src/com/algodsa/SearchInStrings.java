package com.algodsa;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Sairam";
        char chr = 'i';
        System.out.println(search(name,chr));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search2(name,chr));
    }
    // search the char in String
    static boolean search(String str, char chr){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (chr == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char chr){
        if(str.length() == 0){
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (chr== ch){
                return true;
            }
        }
        return false;
    }
}
