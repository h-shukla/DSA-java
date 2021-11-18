package com.himanshu;

public class Conditions {
    public static void main(String[] args) {
        int salary = 35400;
        if (salary > 20000) {
            salary += 2000;
        } else {
            salary += 1000;
        }
        System.out.println("Final salary is " + salary);
    }
}
