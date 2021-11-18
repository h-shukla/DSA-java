package com.himanshu;

// means no matter which sorted order we get array, the binary search will work
public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        int[] arr = {99,66,33,12,1};        // descending
        int[] arr2 = {2,32,42,51,62,67};    // ascending
        int target = 12;

        int res = search(arr, target);
        System.out.println(res);
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether arr is sorted in ascending or descending
        boolean isAscending;
        if (arr[start] < arr[end]) {
            isAscending = true;
        } else {
            isAscending = false;
        }

        while (start<=end) {
            // find middle element
            // start+end/2 might exceed integer value limit. so below code is more efficient
            int mid = start + (end-start)/2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
