package com.himanshu;

import java.util.Scanner;

public class InputQuestion {
    static void sum () {
        System.out.println("Enter a number or enter 0 to quit: ");
        Scanner sc = new Scanner(System.in);
        int n;
        int sum=0;
        while(true) {
            n = sc.nextInt();
            if (n==0) {
                break;
            }
            sum+=n;
        }
        System.out.println(sum + " is the sum");
    }

    static void largest() {
        System.out.println("Enter a number or enter 0 to quit: ");
        Scanner sc = new Scanner(System.in);
        int max=0;
        int n;
        while(true) {
            n=sc.nextInt();
            if (n==0)
                break;
            if(n>max) {
                max = n;
            }
        }
        System.out.println(max + " is the largest number");
    }

    public static void main(String[] args) {
//        sum();
        largest();
    }
}
