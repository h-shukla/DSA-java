package com.himanshu;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(isPrime(n));
//        System.out.println(isArmstrong(n));

        // print all 3 digit armstrong numbers
        for (int i=100; i<1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            } else {}
        }
        // there are only 4 three digit armstrong numbers
    }

    // Armstrong number is a number that is equal to the sum of cubes of its digits e.g. 153
    // check all armstrong numbers
    static boolean isArmstrong(int a) {
        int sum=0;
        int temp=a;
        while (a>0) {
            int rem = a%10;
            int cube = rem*rem*rem;
            sum+=cube;
            a/=10;
        }
        if (sum==temp) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isPrime(int n) {
        if (n<=1) {
            return false;
        }
        int c=2;
        while (c*c<=n) {
            if (n%c==0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
