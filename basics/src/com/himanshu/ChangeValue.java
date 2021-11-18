package com.himanshu;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1,23,42,522,46};
        // here this will modify the array
        change(arr);    // this is passed by call by value
        System.out.println(Arrays.toString(arr));
        // in case of strings we don't modify them rather we create a new object with the same identifier
    }

    static void change(int[] num) {
        num[0] = 99;
    }
}
