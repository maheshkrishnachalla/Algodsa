package com.algodsa;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        /*list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);
        System.out.println(list.contains(565));
        list.set(0,99);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);*/

        for (int i=0;i<5;i++){
            list.add(scanner.nextInt());
        }

        for (int i =0; i < 5; i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }
}
