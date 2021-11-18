package com.himanshu;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        // Q: find the largest of the three numbers
        // Assume a is largest num then start to compare it with others

        int max = a;
        if (b>max) {
            max = b;
        } if (c>max) {
            max = c;
        }

        System.out.println(max);
    }
}
