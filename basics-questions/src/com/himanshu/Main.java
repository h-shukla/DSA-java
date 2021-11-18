package com.himanshu;

public class Main {

    public static void main(String[] args) {
        // program to find power of a number
        int n=9;
        int power=3;
        int res=1;
        for (int i = 0; i < power; i++) {
            res*=n;
            System.out.println(res);
        }
    }
}
