package com.himanshu;

public class MaxItem {

    static void maxI(int[] arr) {
        // assume first element as max then start comparing
        int m = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > m) {
                m = arr[i];
            }
        }
        System.out.println(m);
    }

    static void maxRange(int[] arr, int start, int end) {
        int m = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > m) {
                m = arr[i];
            }
        }
        System.out.println(m);
    }

    public static void main(String[] args) {
        int[]arr = {1,43,34,35,19};
        maxI(arr);
        maxRange(arr, 2, 4);
    }
}
