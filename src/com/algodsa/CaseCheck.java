package com.algodsa;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().trim().charAt(0);
        System.out.println(ch);
        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
