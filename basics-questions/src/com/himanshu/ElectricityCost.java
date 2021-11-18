package com.himanshu;

import java.util.Scanner;

public class ElectricityCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units used: ");

        int units = sc.nextInt();
        float price;

        if (units<=100)
            price=3.44f;
        else if (units>100 && units<=300)
            price=7.54f;
        else
            price=10.24f;

        System.out.println("Your bill should be " + units*price);
    }
}
