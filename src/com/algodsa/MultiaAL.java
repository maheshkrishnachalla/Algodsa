package com.algodsa;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiaAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        System.out.println(list);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(scanner.nextInt());
            }
        }

        System.out.println(list);
    }
}
