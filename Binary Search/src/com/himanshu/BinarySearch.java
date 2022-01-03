package com.himanshu;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2,32,42,51,62,67};
        int target = 67;
        int result = search(arr, target);
        System.out.println(result);
    }

    // return the index
    // return -1 if it does not exist
    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start<=end) {
            // find middle element
            // start+end/2 might exceed integer value limit. so below code is more efficient
            int mid = start + (end-start)/2;

            if (target < arr[mid]) {
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
