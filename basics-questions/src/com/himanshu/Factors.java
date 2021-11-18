package com.himanshu;

public class Factors {

    static void factors(int n) {
        System.out.println("The factors are ");
        for (int i = 1; i <= n; i++) {
            if (n%i==0)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        factors(99);
    }
}
