package com.himanshu;

import java.util.Arrays;

public class swap {
    // Basic swap logic
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[]arr = {1,2,34,35,19};
        swap(arr, 0, 4);

        System.out.println(Arrays.toString(arr));
    }
}
