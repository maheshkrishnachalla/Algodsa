package com.refresher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = scanner.nextInt();
        List<Integer> factorList = new ArrayList<Integer>();
        factorList = factors(n);
        Collections.sort(factorList);
        for (int factor: factorList) {
            System.out.print(factor+", ");
        }

    }

    static List<Integer> factors(int n){
        List<Integer> factors_list = new ArrayList<Integer>();
        factors_list.add(1);
        int x = (int)Math.sqrt(n);
        for (int i = 2; i <= x; i++) {
            if(n%i == 0){
                factors_list.add(i);
                factors_list.add(n/i);
            }
        }
        factors_list.add(n);
        return factors_list;
    }
}
