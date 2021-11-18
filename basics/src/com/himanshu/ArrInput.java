package com.himanshu;

import java.util.Arrays;
import java.util.Scanner;

public class ArrInput {
    public static void main(String[] args) {
        // Array of primitives
        Scanner in = new Scanner(System.in);

//        int[] arr = new int[5];
//        for (int i=0; i<arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        // This is how to print using conventional for loop
//        for (int i=0; i<arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        // for-each loop printing don't do arr[i]
//        // if we print arr[i] then index of the array is printed
//        for (int i:arr)     // For every element in the array, print the element
//            System.out.print(i + " ");  // i represents element of the array
//        System.out.println();
//
//        // easiest and best way to print Arrays
//        System.out.println(Arrays.toString(arr));

        // Array of objects
        String[] str = new String[4];
        for (int i=0; i<str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        // modify
        str[2] = "himanshu";
        System.out.println(Arrays.toString(str));
    }
}
