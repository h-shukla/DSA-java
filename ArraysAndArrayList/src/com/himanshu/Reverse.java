package com.himanshu;

import java.util.Arrays;

public class Reverse {
    // uses the swap logic from that other file
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[]arr = {1,43,34,35,19, 11};
        reverse(arr);
    }
}
