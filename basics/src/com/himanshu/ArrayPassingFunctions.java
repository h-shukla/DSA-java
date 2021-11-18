package com.himanshu;

import java.util.Arrays;

public class ArrayPassingFunctions {
    public static void main(String[] args) {
        int[] nums = {4,3,4,52};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr) {
        arr[0] = 99;
    }
}
