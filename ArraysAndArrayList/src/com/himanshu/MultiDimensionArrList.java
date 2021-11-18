package com.himanshu;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionArrList {
    public static void main(String[] args) {
        // creating an arraylist of arraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // initializing the inner arraylist. Outer is already initialized
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // adding items
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
