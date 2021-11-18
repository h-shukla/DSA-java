package com.himanshu;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // palindrome is a number which when reversed also is the same. Like 1331, 121, etc
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int newNum=0;
        while(num>0) {
            // always take remainder in different variable when reversing a number
            int rem = num%10;
            newNum = newNum*10 + rem;
            num/=10;
        }
        if (n == newNum)
            System.out.println("The number is a palindrome");
        else
            System.out.println("The number is not a palindrome");
    }
}
