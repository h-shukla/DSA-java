package com.himanshu;

public class Factorial {
    static int fact(int n) {
        if (n==0 || n==1)
            return n;
        return n = n * fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
