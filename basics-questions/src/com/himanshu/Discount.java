package com.himanshu;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of the product: ");
        double price = sc.nextDouble();
        System.out.print("Enter the discount in percentage: ");
        int per = sc.nextInt();

        // formula to calculate discount
        double discount = price*per/100;
        System.out.println("The discounted price is " + (price-discount));
    }
}
