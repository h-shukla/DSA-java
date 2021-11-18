package com.himanshu;

public class PrimeOrNot {
    public static void main(String[] args) {
        int a = 37;
        System.out.println(isPrime(a));
    }

    static boolean isPrime(int n) {
        int c=2;
        if (n<=1) {
            return false;
        }
        while (n>c) {
            if (n%c==0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
