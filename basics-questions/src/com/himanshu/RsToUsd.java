package com.himanshu;

import java.util.Scanner;

public class RsToUsd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rupees amount: ");
        int rs = sc.nextInt();
        System.out.println(rs/74 + " is the amount in USD");
    }
}
