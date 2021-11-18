package com.himanshu;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        // Automatic type conversion
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        /*
           Basically, automatic conversion between Smaller type to bigger type works.
           But, it does not work with bigger to small. We have to cast it manually.
         */

        // TypeCasting --> casting withing the compatible types

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)a;   // even after casting, we can't store int value if it is higher than limit. so it gives default value
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        // it automatically promotes byte to int while we do a*b
//        int d = a*b/c;
//        System.out.println(d);

        // Unicode in Java
        System.out.println("こんにちは");    // java supports unicode that's why we are able to do this
        int number = 'A';
        System.out.println(number); // this gives out ASCII value of A
    }
}
