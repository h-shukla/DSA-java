package com.himanshu;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total marks: ");
        double total = sc.nextDouble();
        System.out.println("Enter obtained marks: ");
        double ob = sc.nextDouble();

        double per = (ob/total) * 100;
        double cgpa = per/0.95;

        System.out.println(cgpa/10);
    }
}
