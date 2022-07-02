package com.algodsa;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String dept = scanner.next();
        switch (id){
            case 1:
                System.out.println("Sai");
                break;
            case 2:
                System.out.println("Swathi");
                break;
            case 3:
                System.out.println("emp number 3");
                switch (dept) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "HR":
                        System.out.println("HR department");
                        break;
                    case "Sales":
                        System.out.println("Sales department");
                        break;
                    default:
                        System.out.println("please enter valid department");
                        break;
                }
                break;
            default:
                System.out.println("please enter valid id");



                }

        }
    }


