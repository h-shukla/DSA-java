package com.himanshu;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
         Can't add primitives like int here
         have to add Wrapper Classes
         IT will be more clean when we learn GENERICS in OOPS
         Syntax both are fine () takes initialCapacity parameter
         But can add as many as we want using add method
        */
//        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list = new ArrayList<>(10);

        // adding
        list.add(213);
        list.add(213);
        list.add(21);
        list.add(213);
        list.add(213);
        list.add(213);
        list.add(213);
        list.add(213);

        // printing
        System.out.println(list);

        // removing
        list.remove(2);
        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt()); // this gets added to the last
        }
        System.out.println(list);

        // get element at an index
        // can't do [0] here
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
