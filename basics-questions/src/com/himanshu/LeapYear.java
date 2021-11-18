package com.himanshu;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year to check: ");
        int year = sc.nextInt();
        if (year%4==0)
            System.out.println("The year is Leap year");
        else
            System.out.println("The year is not leap year");
    }
}
