package com.algodsa;

public class Conditions {
    public static void main(String[] args){
        int salary = 25000;
        if(salary>10000){
            salary= salary+2000;
        }
        else{
            salary= salary+3000;
        }
        System.out.println("Employee Salary = "+salary);
    }
}
