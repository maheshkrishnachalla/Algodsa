package com.algodsa;

import java.util.Scanner;

public class VowelOrConsonents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter string : ");
        String str = scanner.next();
        char[] chr = str.toCharArray();
        int v = 0;
        int c = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if(chr[i]=='A'||chr[i]=='E'||chr[i]=='I'||chr[i]=='O'||chr[i]=='U'||
                    chr[i]=='a'||chr[i]=='e'||chr[i]=='i'||chr[i]=='o'||chr[i]=='u'){
                System.out.println(chr[i]+ " : vowel");
                v++;
            }
            else{
                System.out.println(chr[i]+" : consonent");
                c++;
            }

        }
        System.out.println("Number of consonents : "+c);
        System.out.println("Number of vowels : "+v);

    }
}
